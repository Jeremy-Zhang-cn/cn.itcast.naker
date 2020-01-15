package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/activeUserServlet")
public class ActiveUserServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取激活码
		String code = request.getParameter("code");
		//调用service完成激活
		UserService service = new UserServiceImpl();
		boolean flag = service.active(code);

		String msg = null;

		//判断标记
		if (flag) {
			//激活成功
			msg = "激活成功，请<a href='login.html'>登录</a>";

		} else {
			//激活失败
			msg = "激活失败";
		}

		response.getWriter().write(msg);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
