package com.itheima.web.servlet;

import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取参数
		String currentPage = request.getParameter("currentPage");
		String rows = request.getParameter("rows");

		if (currentPage == null || "".equals(currentPage)) {
			currentPage = "1";
		}

		if (rows == null || "".equals(rows)) {
			rows = "5";
		}

		//获取条件查询参数
		Map<String, String[]> condition = request.getParameterMap();



		//调用service查询
		PageBean<User> pb = new UserServiceImpl().findUserByPage(currentPage, rows, condition);

		//将PageBean存入request
		request.setAttribute("pb", pb);
		//将查询条件也存入request
		request.setAttribute("condition",condition);

		//转发至list
		request.getRequestDispatcher("/list.jsp").forward(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
