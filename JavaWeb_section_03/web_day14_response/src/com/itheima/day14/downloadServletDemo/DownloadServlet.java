package com.itheima.day14.downloadServletDemo;

import com.itheima.day14.util.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取文件名
		String filename = request.getParameter("filename");
		//使用字节流加载文件
		//首先获取文件在服务器中的正式路径
		ServletContext servletContext = this.getServletContext();
		String path = servletContext.getRealPath("/img/" + filename);
		//使用字节流加载文件
		byte[] bytes = new byte[1024*4];
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
		//指定response的响应头： content=disposition:attachment;filename=xxx;
		//获取文件的MIME类型
		String mimeType = servletContext.getMimeType(filename);
		//在响应头中添加MIME类型
		response.setHeader("content-type",mimeType);
		//设置响应头打开方式
		response.setHeader("content-disposition","attachment;filename="+filename);

		//解决中文文件名问题
		//1.获取user-agent请求头
		String agent = request.getHeader("user-agent");
		//2.使用工具类方法编码文件名
		DownLoadUtils.getFileName(agent,filename);
		//将数据写出到response输出流
		ServletOutputStream os = response.getOutputStream();
		int len = 0;
		while ((len = bis.read(bytes)) != -1) {
			os.write(bytes,0,len);
		}
		bis.close();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
