package com.itheima.web.servlet;

import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteSelectedServlet")
public class DeleteSelectedServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取所有被选中的条目的id
		String[] cbs = request.getParameterValues("cb");

		//调用service删除
		new UserServiceImpl().delSelectedUser(cbs);

		//跳转到查询servlet
		response.sendRedirect(request.getContextPath() + "/userListServlet");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
