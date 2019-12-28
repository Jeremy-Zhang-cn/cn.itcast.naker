package com.itheima.timeDemo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
	1. 访问一个Servlet，如果是第一次访问，则提示：您好，欢迎您首次访问。
	2. 如果不是第一次访问，则提示：欢迎回来，您上次访问时间为:显示时间字符串
 */

@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		Cookie[] cookies = request.getCookies();
		boolean flag = false;  //设置标志

		if (cookies != null && cookies.length > 0) {

			for (Cookie cookie : cookies) {

				if ("lastTime".equals(cookie.getName())) {

					flag = true;    //如果cookie中存在有lastTime，将标志置为true
					String value = cookie.getValue();  //获取lastTime对应的value

					//使用utf-8编码格式进行解码
					String decode_time = URLDecoder.decode(value, "utf-8");
					response.getWriter().write("您好，欢迎回来，上次访问时间为：" + decode_time);

					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					String format_time = sdf.format(date);

					//使用utf-8格式对时间进行编码，消除掉空格在解码后出现乱码的情况
					String encode_time = URLEncoder.encode(format_time, "utf-8");
					cookie.setValue(encode_time);
					//设置cookie生存时间
					cookie.setMaxAge(60 * 60 * 24 * 7);
					//添加cookie
					response.addCookie(cookie);
					break;
				}
			}
		}

		if (cookies == null || cookies.length == 0 || !flag) {    //通过cookie中是否有内容判断是否为初次访问
			response.getWriter().write("您好，欢迎您首次访问");
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
			String format_time = sdf.format(date);
			//编码
			String encode_time = URLEncoder.encode(format_time, "utf-8");
			Cookie c = new Cookie("lastTime", encode_time);
			c.setMaxAge(60 * 60 * 24 * 7);
			response.addCookie(c);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.doPost(request, response);
	}
}
