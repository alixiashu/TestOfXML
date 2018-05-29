package cn.alixia.web.servletReflect;

public class MyServletReflect implements IMyServlet{

	@Override
	public void init() {
		System.out.println("MyServletReflect initialing...");
	}

	@Override
	public void service() {
		System.out.println("MyServletReflect servicing...");		
	}

	@Override
	public void destory() {
		System.out.println("MyServletReflect destorying...");
	}
	
	
}
