package com.itheima.day_07.homework.demo_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_02 {

	/*
		有2个数组，第一个数组内容为：["黑龙江省","浙江省","江西省","广东省","福建省"]，
               第二个数组内容为：["哈尔滨","杭州","南昌","广州","福州"]，
			   将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
			   如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
			   使用两种方式遍历map集合
	 */
	public static void main(String[] args) {

		String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
		String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], arr2[i]);
		}

		//遍历方式1
		Set<String> strings = map.keySet();
		for (String string : strings) {
			System.out.println(string + "=" + map.get(string));
		}

		System.out.println("~~~~~~~~~~~~~~~");

		//遍历方式2
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
