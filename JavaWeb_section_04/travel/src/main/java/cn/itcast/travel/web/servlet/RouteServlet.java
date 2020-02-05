package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.FavoriteService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.FavoriteServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {

	private RouteService routeService = new RouteServiceImpl();
	private FavoriteService favoriteService = new FavoriteServiceImpl();

	/**
	 * 分页查询
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void pageQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//接收参数
		String currentPageStr = request.getParameter("currentPage");
		String pageSizeStr = request.getParameter("pageSize");
		String cidStr = request.getParameter("cid");

		//获取rname 线路名称
		String rname = request.getParameter("rname");
		rname = new String(rname.getBytes("iso-8859-1"), "utf-8");

		//处理参数
		int cid = 0;
		if (cidStr != null && cidStr.length() > 0 && !"null".equals(cidStr)) {
			cid = Integer.parseInt(cidStr);
		}

		int pageSize = 0;    //每页显示条数，如果不传递，默认为5条
		if (pageSizeStr != null && pageSizeStr.length() > 0) {
			pageSize = Integer.parseInt(pageSizeStr);
		} else {
			pageSize = 5;
		}

		int currentPage = 0;    //当前页码，如果不传递，默认为第一页
		if (currentPageStr != null && currentPageStr.length() > 0 && !"null".equals(currentPageStr)) {
			currentPage = Integer.parseInt(currentPageStr);
		} else {
			currentPage = 1;
		}

		//调用service查询PageBean对象
		PageBean<Route> pb = routeService.pageQuery(cid, currentPage, pageSize, rname);
		//序列化PageBean对象并返回客户端
		writeValue(pb, request, response);

	}

	public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. 接收id
		String rid = request.getParameter("rid");
		//2.调用service查询route对象
		Route route = routeService.findOne(rid);
		//3.转换为json写回客户端
		writeValue(route, request, response);
	}

	/**
	 * 判断当前登录用户是否收藏过该路线
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void isFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//获取路线id
		String rid = request.getParameter("rid");

		//获取当前登录的用户
		User user = (User) request.getSession().getAttribute("user");
		int uid; //用户id
		if (user == null) {
			//用户尚未登录
			uid = 0;
		} else {
			//用户已登录
			uid = user.getUid();
		}

		//调用FavoriteService查询是否收藏
		boolean flag = favoriteService.isFavorite(rid, uid);

		//4. 写回客户端
		writeValue(flag, request, response);
	}

	/**
	 * 添加收藏
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void addFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//获取线路rid
		String rid = request.getParameter("rid");
		//获取当前登录用户
		User user = (User) request.getSession().getAttribute("user");
		int uid; //用户id

		if (user == null) {
			//用户尚未登录
			return ;
		} else {
			//用户已登录
			uid = user.getUid();
		}

		//调用service添加
		favoriteService.add(rid, uid);
	}
}