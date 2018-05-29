package cn.alixia.web.servletReflect;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestMyServlet {
	
	@Test
	public void testMyServReflect() {
		try {
			//1、创建解析器
			SAXReader reader = new SAXReader();
			//2、解析xml文件得到Dom文件
			Document doc = reader.read("src/cn/alixia/web/servletReflect/Web.xml");
			//3、获取根节点
			Element root = doc.getRootElement();
			//4、根据名称获取servlet节点
			Element servlet = root.element("servlet");
			//5、根据名称获得servlet-class节点
			Element servletName = servlet.element("servlet-class");
			//6、获得servlet-name文本
			String clazzName = servletName.getText();
//			System.out.println(clazzName);
			//7、通过类全名获取字节码文件
			Class clazz = Class.forName(clazzName);
			//8、创建实例对象
			MyServletReflect myServlet1 = (MyServletReflect)clazz.newInstance();
			//9、调用实例方法
			myServlet1.init();
			myServlet1.service();
			myServlet1.destory();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
