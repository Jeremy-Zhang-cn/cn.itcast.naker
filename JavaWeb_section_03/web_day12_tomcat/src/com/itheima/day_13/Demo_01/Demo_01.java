package com.itheima.day_13.Demo_01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo_01")
public class Demo_01 implements Servlet {
	@Override
	public void init(ServletConfig servletConfig) {
		System.out.println("init...");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
		System.out.println("service...");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destroy...");
	}
}
