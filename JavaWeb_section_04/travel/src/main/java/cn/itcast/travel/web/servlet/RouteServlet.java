package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.RouteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {

	private RouteService service = new RouteServiceImpl();

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
		if (cidStr != null && cidStr.length() > 0) {
			cid = Integer.parseInt(cidStr);
		}

		int pageSize = 0;    //每页显示条数，如果不传递，默认为5条
		if (pageSizeStr != null && pageSizeStr.length() > 0) {
			pageSize = Integer.parseInt(pageSizeStr);
		} else {
			pageSize = 5;
		}

		int currentPage = 0;    //当前页码，如果不传递，默认为第一页
		if (currentPageStr != null && currentPageStr.length() > 0) {
			currentPage = Integer.parseInt(currentPageStr);
		} else {
			currentPage = 1;
		}

		//调用service查询PageBean对象
		PageBean<Route> pb = service.pageQuery(cid, currentPage, pageSize,rname);
		//序列化PageBean对象并返回客户端
		writeValue(pb, request, response);

	}


}
