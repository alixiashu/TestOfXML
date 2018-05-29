package cn.alixia.web.servlet;

public class MyServletImpl implements IMyServlet{

	@Override
	public void init() {
		System.out.println("On Initialing!");
	}

	@Override
	public void service() {
		System.out.println("On Service!");
	}

	@Override
	public void destory() {
		System.out.println("On Destorying!");
	}

}
