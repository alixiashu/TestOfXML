package cn.alixia.xml.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;


public class TestDom4j {
	@Test
	public void TestReadWebXml() {
		
		try {
			//1、获取SaxReader解析器
			SAXReader  saxReader = new SAXReader();
			//2、读取xml文档，Dom解析
			Document doc = saxReader.read("src/cn/alixia/schema/Web.xml");
			//3、获取根元素
			Element rootElement = doc.getRootElement();
//			System.out.println(rootElement.getName());//获取根元素名称
//			System.out.println(rootElement.attributeValue("version"));//获取根元素版本号
			//4、获取根元素下的子元素
			List<Element> childrenEelements = rootElement.elements();
			for (Element element : childrenEelements) {
//				System.out.println(element.getName());
				if(element.getName().equals("servlet")) {
					Element elementName = element.element("servlet-name");
					Element elementClass = element.element("servlet-class");
					
					System.out.println(elementName.getText());
					System.out.println(elementClass.getText());
					
				}
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
