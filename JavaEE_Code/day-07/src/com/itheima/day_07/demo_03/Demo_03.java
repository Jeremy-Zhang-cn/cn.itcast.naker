package com.itheima.day_07.demo_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_03 {

	public static void main(String[] args) {

		HashMap<Student, String> hm = new HashMap<>();

		hm.put(new Student("张三", 20), "郑州");
		hm.put(new Student("李四", 22), "武汉");
		hm.put(new Student("王五", 21), "洛阳");
		hm.put(new Student("张三", 20), "北京");	//键相同会覆盖原来值的内容

		//通过键值对的方式遍历HashMap
		Set<Map.Entry<Student, String>> entries = hm.entrySet();
		for (Map.Entry<Student, String> entry : entries) {
			System.out.println(entry);
		}
	}

}
