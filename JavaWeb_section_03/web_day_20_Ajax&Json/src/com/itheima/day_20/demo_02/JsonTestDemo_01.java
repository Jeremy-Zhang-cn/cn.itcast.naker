package com.itheima.day_20.demo_02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Date;

public class JsonTestDemo_01 {

	@Test
	public void test_01() {

		//创建Person对象
		Person p = new Person();
		p.setName("张三");
		p.setAge(23);
		p.setGender("男");
		p.setBirthday(new Date());

		//转换
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(p);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test_02() {

		//创建Person对象
		Person p = new Person();
		p.setName("张三");
		p.setAge(23);
		p.setGender("男");
		p.setBirthday(new Date());

		ObjectMapper mapper = new ObjectMapper();


	}

}
