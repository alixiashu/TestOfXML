package cn.alixia.web.servlet;

import org.junit.Test;

public class TestMyServlet {
	@Test
	public void testMyServ() {
		MyServletImpl myServlet = new MyServletImpl();
		myServlet.init();
		myServlet.service();
		myServlet.destory();
	}
	@Test
	public void testMyServReflect() {
		try {
			String className = "cn.alixia.web.servlet.MyServletImpl";
			Class clazz = Class.forName(className);
			MyServletImpl myServlet = (MyServletImpl)clazz.newInstance();
			myServlet.init();
			myServlet.service();
			myServlet.destory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
