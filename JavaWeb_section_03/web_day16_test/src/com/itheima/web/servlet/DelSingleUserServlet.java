package com.itheima.web.servlet;

import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSingleUserServlet")
public class DelSingleUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取用户id
		String uid = request.getParameter("id");
		int id = Integer.parseInt(uid);

		//调用UserService的实现类对象的删除方法
		new UserServiceImpl().delSingleUser(id);

		//跳转至罗列用户信息页面
		response.sendRedirect(request.getContextPath()+"/userListServlet");


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
