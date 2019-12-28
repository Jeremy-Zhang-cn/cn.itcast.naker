package com.itheima.verify_code;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/*
	1. 访问带有验证码的登录页面login.jsp
	2. 用户输入用户名，密码以及验证码。
		* 如果用户名和密码输入有误，跳转登录页面，提示:用户名或密码错误
		* 如果验证码输入有误，跳转登录页面，提示：验证码错误
		* 如果全部输入正确，则跳转到主页success.jsp，显示：用户名,欢迎您
 */

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//从session中获取生成的验证码
		String verify_code = (String)request.getSession().getAttribute("VERIFY_CODE");

		//获取用户输入的验证码
		String user_verify_code = request.getParameter("USER_VERIFY_CODE");

		//移除session中存储的验证码，否则会造成验证码二次输入的时候无法验证通过
		request.getSession().removeAttribute("VERIFY_CODE");

		//判断用户输入的验证码是否正确（忽略大小写）
		if (verify_code != null) {

			if (verify_code.equalsIgnoreCase(user_verify_code)) {

				/*
				//验证用户登录信息是否正确
				String username = request.getParameter("username");	//获取用户输入的用户名
				String password = request.getParameter("password");	//获取用户输入的密码
				*/

				//获取用户输入信息
				Map<String, String[]> map = request.getParameterMap();
				//创建User对象,用于封装信息
				User user = new User();
				//创建UserDao对象，与数据库中用户信息比对，用于验证用户信息正确性
				UserDao userDao = new UserDao();

				try {
					//封装user对象
					BeanUtils.populate(user,map);
					//验证用户信息是否存在
					user = userDao.login(user);
				} catch (IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}

			//	if ("zhangsan".equals(username) && "123456".equals(password)) {    //验证登录信息是否正确

				if (user != null) {    //验证登录信息是否正确
					//如果信息正确，跳转至登陆成功页面
					String username = user.getUsername();	//获取用户名
					request.setAttribute("username", username);    //将用户名存储到request中
					//通过请求转发的形式将用户名传入登陆成功页面
					request.getRequestDispatcher("successServlet").forward(request, response);
				} else {

					//如果登录信息有误，提示用户
					request.setAttribute("login_error","用户名或密码有误");
					request.getRequestDispatcher("/login.jsp").forward(request,response);
				}


			} else {

				//提示用户输入的验证码有误
				request.setAttribute("vc_error","验证码错误");
				request.getRequestDispatcher("/login.jsp").forward(request,response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
