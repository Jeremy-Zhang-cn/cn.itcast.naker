package com.itheima.controller.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("str")
public class StringController {

	@RequestMapping(value = "/show_01",produces = {"text/html;charset=utf-8"})	//produces = {"text/html;charset=utf-8"}解决响应的中文乱码问题
	@ResponseBody
	public String show_01() {
		return "<h1>你好</h1>";
	}

	@RequestMapping("/show_02")
	@ResponseBody
	public String show_02() {
		return "{\"name\":\"zhangsan\",\"age\":23}";
	}

	@RequestMapping("/show_03")
	@ResponseBody
	public String show_03() throws JsonProcessingException {

		//假设从后台获取一个user对象
		User user = new User("lisi", 24);
		//把user对象转换为json字符串
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(user);
		//返回json字符串
		return json;
	}

	@RequestMapping("/show_04")
	@ResponseBody
	public User show_04() {
		//假设从后台获取一个user对象
		User user = new User("wangwu", 25);
		//返回user对象（springMVC会自动把对象转换为json字符串，底层用的jackson。前提是导入了jackson的jar包）
		return user;
	}

}
