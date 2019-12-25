package com.itheima.day13.Demo_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/servletDemo_02")
public class ServletDemo_02 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//设置流的编码，防止post方法提交的时候出现中文乱码
		request.setCharacterEncoding("utf-8");

		//根据参数名称获取参数值
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + "--" + password);
		System.out.println("----------------");

		//根据参数名获取参数值的数组
	/*	String[] hobbies = request.getParameterValues("hobby");
		System.out.println(hobbies);
		System.out.println("-----------");*/

		//获取所有参数的map集合
		Map<String, String[]> parameterMap = request.getParameterMap();
		Set<String> keys = parameterMap.keySet();
		for (String key : keys) {
			//根据键获取值
			String[] values = parameterMap.get(key);
			System.out.println(key);
			for (String value : values) {
				System.out.println(value);
			}
			System.out.println("-----");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}
