package cn.alixia.web.servletReflect;

public class MyServletReflect2 implements IMyServlet{

	@Override
	public void init() {
		System.out.println("MyServletReflect2 initialing...");
	}

	@Override
	public void service() {
		System.out.println("MyServletReflect2 servicing...");		
	}

	@Override
	public void destory() {
		System.out.println("MyServletReflect2 destorying...");
	}
	
	
}

