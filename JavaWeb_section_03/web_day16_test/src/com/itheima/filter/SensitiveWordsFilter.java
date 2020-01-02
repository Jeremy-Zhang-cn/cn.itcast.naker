package com.itheima.filter;

import com.itheima.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.*;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {

	/*
		敏感词过滤
	 */

	private List<String> list = new ArrayList<>();	//敏感词汇集合

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
		//创建代理对象，增强getParameter方法
		ServletRequest proxy_req = (ServletRequest)Proxy.newProxyInstance(req.getClass().getClassLoader(),
				req.getClass().getInterfaces(),
				(proxy, method, args) -> {

					//增强getParameter方法
					//判断是否是getParameter方法
					if (method.getName().equals("getParameter")) {
						//增强返回值
						//获取返回值
						String value = (String) method.invoke(req, args);
						if (value != null) {
							for (String s : list) {
								if (value.contains(s)) {
									value = value.replaceAll(s, "***");
								}
							}
						}
						return value;
					}

					if (method.getName().equals("getParameterMap")) {

						Map<String, String[]> map = (Map<String, String[]>)method.invoke(req, args);

						Set<Map.Entry<String, String[]>> entries = map.entrySet();

						for (Map.Entry<String, String[]> entry : entries) {

							String[] values = entry.getValue();

							for (String s : list) {
								for (String value : values) {
									if (value.contains(s)) {
										value = value.replaceAll(s, "***");
									}
								}
							}
						}
						return map;

					}

					return method.invoke(req,args);

				});
		//放行
		chain.doFilter(proxy_req,resp);
	}

	public void init(FilterConfig config) throws ServletException {

		//获取文件真实路径
		ServletContext servletContext = config.getServletContext();
		String realPath = servletContext.getRealPath("/WEB-INF/classes/dirty_words.txt");

	//	InputStream resource = SensitiveWordsFilter.class.getClassLoader().getResourceAsStream("dirty_words.txt");

		try {

			//读取文件
			//InputStreamReader is = new InputStreamReader(resource, "utf-8");
			InputStreamReader is = new InputStreamReader(new FileInputStream(realPath), "utf-8");
			BufferedReader br = new BufferedReader(is);
			//将文件的每一行添加到list中
			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
