package com.itheima.day14.response_demo_01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletResponse_04")
public class ServletResponse_04 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取ServletContext对象
		ServletContext servletContext = this.getServletContext();
		//获取表单元素
		String filename = request.getParameter("filename");
		//使用getMimeType获取文件类型
		String mimeType = servletContext.getMimeType(filename);
	//	System.out.println(mimeType);
		response.getWriter().write(mimeType);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
