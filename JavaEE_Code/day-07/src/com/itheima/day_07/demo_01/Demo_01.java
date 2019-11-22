package com.itheima.day_07.demo_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_01 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		map.put("张无忌", "赵敏");
		map.put("张三", "李四");

		/*
			*public V remove(Object key)     	 	: 根据传入的键, 删除集合中的映射关系.
			* boolean containsKey(Object key)(重点) 	 	: 判断是否包含传入的键
			* boolean containsValue(Object value)	: 判断是否包含传入的值
			* boolean isEmpty()					 	: 判断集合是否为空
			* int size() 						 	: 获取集合的元素个数
		*/
		System.out.println(map.containsKey("杨过"));	//map是否包含某键
		map.remove("张三");	//根据键移除元素
		System.out.println(map.containsValue("李四"));	//map是否包含某值
		System.out.println(map.size());	//map的长度
	//	map.clear();
		System.out.println(map.isEmpty());	//map是否为空

		System.out.println("~~~~~~~~~~~~~~~");

		//遍历方式1，将map中的键值对封装成对象装入Set集合，遍历集合，通过getKey()和getValue()获取对象中的内容
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> me : set) {
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + " ," + value);
		}
		System.out.println("~~~~~~~~~~~~~");

		//遍历方式2，速度较于方式1略快（没有封装和转换的过程），将map中的键装入Set集合中。遍历集合，通过键获取对应的值
		Set<String> strings = map.keySet();
		for (String string : strings) {
			System.out.println(string + " ," + map.get(string));
		}

	}

}
