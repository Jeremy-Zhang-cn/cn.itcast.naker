package com.itheima.day_07.demo_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_02 {

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();

		hm.put("itheima001", new Student("张三", 20));
		hm.put("itheima002", new Student("李四", 21));
		hm.put("itheima003", new Student("王五", 23));
		hm.put("itheima001", new Student("张三", 21));//键相同会覆盖原来值的内容

		//遍历方式1，获取键值对集合
		Set<Map.Entry<String, Student>> entries = hm.entrySet();
		for (Map.Entry<String, Student> entry : entries) {
			System.out.println(entry);
		}
		System.out.println("~~~~~~~~~~~~~");

		//遍历方式2，获取键集合，通过键获取值
		Set<String> strings = hm.keySet();
		for (String string : strings) {
			System.out.println(string + "=" + hm.get(string));
		}
	}

}
