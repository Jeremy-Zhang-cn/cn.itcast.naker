package com.itheima.controller.request;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/other")
public class OtherController {


	/*
		@RequestBody可以解析请求中的json字符串，
		并把json字符串封装为对象
		@RequestBody用来接收跨项目请求中的参数
	 */

	@RequestMapping("/ajaxShow")
	@ResponseBody
	public String ajaxShow(@RequestBody User user) {
		System.out.println(user);
		return "ajaxShow";
	}

	//@RequestParam放在参数之前作用是要求请求中必须携带这个参数，否则就会报错
	@RequestMapping("/rpShow")
	@ResponseBody
	public String rpShow(@RequestParam String name) {
		System.out.println(name);
		return "rpShow";
	}

	/*
		restful风格 {}为占位符，如果有多个参数，用/隔开
	 */
	@RequestMapping("/show_01/{name}/{age}")
	@ResponseBody
	public String show_01(@PathVariable(value = "name") String name, @PathVariable(value = "age") Integer age) {
		System.out.println(name + age);
		return "success";
	}

	//在实际开发中一般不使用类型转换器，对于日期类型，一般的要求是“可选不可填”
	@RequestMapping("/show_02")
	@ResponseBody
	public String show_02(Date date) {
		System.out.println(date);
		return "success";
	}

	//@RequestHeader获取指定的请求头信息
	@RequestMapping("/show_03")
	@ResponseBody
	public String show_03(@RequestHeader("User-Agent") String userAgent) {
		System.out.println(userAgent);
		return "success";
	}

	//@CookieValue获取指定名称的Cookie的值
	@RequestMapping("/show_04")
	@ResponseBody
	public String show_04(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println(sessionId);
		return "success";
	}

}
