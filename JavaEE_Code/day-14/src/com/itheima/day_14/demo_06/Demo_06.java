package com.itheima.day_14.demo_06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo_06 {

	/*
		字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，并遍历ArrayList集合
		要求：同时满足如下要求
			1:姓名长度大于2
			2:年龄大于33
		分析:
			1:有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
        	2:必须同时满足两个条件,所以可以使用and方法连接两个判断条件

	 */
	public static void main(String[] args) {
		String[] array = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};

		ArrayList<String> list = myFilter(

				//需要遍历的数组
				array,
				//判断姓名长度
				s -> (s.split(",")[0]).length() > 2,
				//判断年龄
				s -> Integer.parseInt((s.split(",")[1])) > 33
		);
		System.out.println(list);
	}

	private static ArrayList<String> myFilter(String[] array, Predicate<String> pre1, Predicate<String> pre2) {

		ArrayList<String> list = new ArrayList<>();

		for (String s : array) {
			if (pre1.and(pre2).test(s)) {
				list.add(s);
			}
		}

		return list;
	}
}
