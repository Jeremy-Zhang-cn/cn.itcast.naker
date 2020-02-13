package com.itheima.resolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

		ModelAndView mv = new ModelAndView();

		//判断异常类型
		if (e instanceof ArithmeticException) {
			//除零异常
			mv.setViewName("arith");	//会经过视图解析器
		} else if (e instanceof NullPointerException) {
			//空指针异常
			mv.setViewName("nullex");
		} else {
			//其他异常
			mv.setViewName("error");
		}

		return mv;
	}
}
