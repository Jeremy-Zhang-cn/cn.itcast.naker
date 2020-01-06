package com.itheima.day_20.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.day_20.domain.User;
import com.itheima.day_20.service.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取用户名
		String username = request.getParameter("username");

		//调用service层判断用户名是否存在
		Map<String, Object> map = new HashMap<>();
		User usr;
		try {
			usr = new UserServiceImpl().findUser(username);
		} catch (Exception e) {
			usr = null;
			e.printStackTrace();
		}

		if (usr != null) {
			//存在
			map.put("userExist", true);
			map.put("msg", "用户名已存在");
		} else {
			//不存在
			map.put("userExist", false);
			map.put("msg", "用户名可以使用");
		}

		//将map转换为json，并传递给客户端
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(response.getWriter(), map);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
