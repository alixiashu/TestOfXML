package cn.alixia.web.servletReflect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

public class TestMyServletAll {
	Map<String,String> clazzMap = new HashMap<>();
	@Before
	public void testReflect() {
		try {
			//1、创建解析器
			SAXReader reader = new SAXReader();
			//2、解析xml文件得到Dom文件
			Document doc = reader.read("src/cn/alixia/web/servletReflect/Web.xml");
			//3、获取根节点
			Element root = doc.getRootElement();
			//4、根据名称获取servlet节点
			List<Element> eles = root.elements();
			/* 模拟浏览器，按照url映射类
			 * i) 遍历所有子节点
			 * ii) 将所有servlet的字节点中的servlet-name和servlet-class存成map键值对
			 * iii) 根据键值对里的servlet-name查找servlet-mapping里的url替换掉servlet-name
			 */
			
			//5、遍历根节点的所有子节点
			for (Element ele : eles) {
				if(ele.getName().equals("servlet")) {
					String servletName = ele.element("servlet-name").getText();
//					String servletName = ele.elementText("servlet-name");
					String clazzName = ele.element("servlet-class").getText();
					clazzMap.put(servletName, clazzName);
				}
				if(ele.getName().equals("servlet-mapping")) {
					String servletName = ele.element("servlet-name").getText();
					String url = ele.element("url-pattern").getText();
					String clazzName = clazzMap.get(servletName);
					clazzMap.remove(servletName);
					clazzMap.put(url, clazzName);	
				}
			}
			//6、输出验证测试
			System.out.println(clazzMap);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testMyServReflect() {
		
		try {
			//1、模拟路径
			String url = "/myServletReflect2";
			//2、根据路径查找对应类名
			String clazzName = clazzMap.get(url);
			//3、根据类全名生成类实例并调用其方法
			IMyServlet myServlet = (IMyServlet)Class.forName(clazzName).newInstance();
			myServlet.init();
			myServlet.service();
			myServlet.destory();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
