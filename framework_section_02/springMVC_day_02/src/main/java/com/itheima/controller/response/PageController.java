package com.itheima.controller.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/show_01")
	public String show_01() {
		return "success";	//直接return会经过视图解析器
	}

	@RequestMapping("/show_02")
	public String show_02() {
		return "redirect:/success.jsp";	//如果不想经过视图解析器需要添加前缀（redirect或者forward）
	}

	@RequestMapping("/show_03")
	public ModelAndView show_03() {
		System.out.println("show_03执行了");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/success.jsp");	//vieName中的字符串语法和直接return的语法一样
		return mv;
	}

	@RequestMapping("/show_04")
	public ModelAndView show_04() {

		ModelAndView mv = new ModelAndView();
		//为mv添加model数据
		mv.addObject("msg", "show_04");
		//如果执行的是转发，数据会被添加到request域中
		//如果执行的是重定向，数据会被作为参数拼接在地址后边传递给下一个页面
		mv.setViewName("redirect:/message.jsp");
	//	mv.setViewName("forward:/message.jsp");
		return mv;
	}

	@RequestMapping("/show_05")
	public ModelAndView show_05(ModelAndView mv) {

		mv.addObject("msg", "show_05");
		mv.setViewName("message");	//相当于return "message",默认为请求转发，能够接收到msg信息
		return mv;
	}

	@RequestMapping("/show_06")
	public String show_06(Model model) {
		//可以单独设置Model
		model.addAttribute("msg", "show_06");
		return "message";

	}

	//使用springMVC就是为了替代以下代码
	@RequestMapping("/show_07")
	public String show_07(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		System.out.println(request);
		System.out.println(response);
		System.out.println(session);
		return "message";
	}


}
