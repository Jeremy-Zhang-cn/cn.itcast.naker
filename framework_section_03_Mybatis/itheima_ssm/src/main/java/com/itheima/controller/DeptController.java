package com.itheima.controller;

import com.itheima.domain.Department;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	/*
		查询出所有的科室信息，返回json字符串
	 */
	@RequestMapping("/listAll")
	@ResponseBody
	public List<Department> listAll() {

		System.out.println(deptService.listAll());
		return deptService.listAll();

	}

}
