package com.itheima.day21_jedis.demo.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.day21_jedis.demo.domain.Province;
import com.itheima.day21_jedis.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAllServlet")
public class FindAllServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");

		//调用service查询
		String json = new UserServiceImpl().findAllJson();
/*

		//序列化查询结果
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);

*/

		//响应结果
		response.getWriter().write(json);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
