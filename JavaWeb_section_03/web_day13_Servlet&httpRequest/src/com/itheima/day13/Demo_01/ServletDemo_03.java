package com.itheima.day13.Demo_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo_03")
public class ServletDemo_03 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	//	request.setAttribute("name","张三");
	//	System.out.println("servletDemo_03执行了。。。");
	//	System.out.println("~~~~~~~~~~~~~~");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (("zhangsan".equals(username)) && ("123456".equals(password))) {
			request.setAttribute("name",username);
			request.getRequestDispatcher("/servletDemo_04").forward(request,response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}
