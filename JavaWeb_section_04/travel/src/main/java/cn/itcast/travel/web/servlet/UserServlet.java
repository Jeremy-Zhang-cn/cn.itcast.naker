package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {

	//声明UserService业务对象
	private UserService service = new UserServiceImpl();

	//复用ObjectMapper对象
	private ObjectMapper mapper = new ObjectMapper();

	/**
	 * 用户注册
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		//获取数据
		Map<String, String[]> map = request.getParameterMap();
		//获取生成的验证码
		String checkcode_server = (String)request.getSession().getAttribute("CHECKCODE_SERVER");

		String check = request.getParameter("check");	//获取用户输入的验证码

		//移除session中存储的验证码，否则会造成验证码二次输入的时候无法验证通过
		request.getSession().removeAttribute("VERIFY_CODE");

		//比较
		if (checkcode_server == null || !checkcode_server.equalsIgnoreCase(check)) {
			//验证码有误
			ResultInfo info = new ResultInfo();
			//注册失败
			info.setFlag(false);
			info.setErrorMsg("验证码错误");
			//将info对象序列化为json
		//	String json = writeValueAsString(info);
			writeValue(info,request,response);

		//	response.getWriter().write(json);

			return;

		}

		//封装对象
		User user = new User();

		try {
			BeanUtils.populate(user,map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		//调用service完成注册
		boolean flag = service.regist(user);
		ResultInfo info = new ResultInfo();
		//响应结果
		if (flag) {
			//注册成功
			info.setFlag(true);
		} else {
			//注册失败
			info.setFlag(false);
			info.setErrorMsg("注册失败！用户名已存在！");
		}

		//将info对象序列化为json
	//	String json = writeValueAsString(info);

		//将json数据写回客户端
	//	response.getWriter().write(json);
		writeValue(info,request,response);
	}

	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");

		//获取用户数据
		Map<String, String[]> map = request.getParameterMap();
		//封装User对象
		User user = new User();

		try {
			BeanUtils.populate(user, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		//调用service查询
		User u = service.login(user);

		ResultInfo info = new ResultInfo();

		//判断用户对象是否为null
		if (u == null) {
			//用户名或密码错误
			info.setFlag(false);
			info.setErrorMsg("用户名或密码错误！");
		}

		//判断用户是否激活
		if (u != null && "N".equals(u.getStatus())) {
			//用户尚未激活
			info.setFlag(false);
			info.setErrorMsg("您尚未激活，请激活");
		}

		//判断登录成功
		if (u != null && "Y".equals(u.getStatus())) {
			//登陆成功
			info.setFlag(true);
			request.getSession().setAttribute("user", u);
		}

		//响应数据
	//	mapper.writeValue(response.getOutputStream(), info);
		writeValue(info,request,response);

	}

	/**
	 * 查询单个用户对象
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		//从session中获取登录用户
		Object user = request.getSession().getAttribute("user");
		//将user写回客户端
	//	mapper.writeValue(response.getOutputStream(),user);
		writeValue(user,request,response);

	}

	/**
	 * 退出登录功能
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//销毁session
		request.getSession().invalidate();
		//跳转登录页面
		response.sendRedirect(request.getContextPath() + "/login.html");
	}

	/**
	 * 激活功能
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取激活码
		String code = request.getParameter("code");
		//调用service完成激活
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



}
