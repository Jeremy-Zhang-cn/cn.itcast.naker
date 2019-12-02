package com.itheima.day_14.demo_10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo_10 {

	public static void main(String[] args) {
		//创建一个集合，存储多个字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("张曼玉");
		list.add("王祖贤");
		list.add("柳岩");
		list.add("张敏");
		list.add("张无忌");



		//需求1：取前4个数据组成一个流
		Stream<String> s1 = list.stream().limit(4);

		//需求2：跳过2个数据组成一个流
		Stream<String> s2 = list.stream().skip(2);

		//需求3：合并需求和需求2得到的流，并把结果输出在控制台，要求元素不能重复
	//	Stream.concat(s1, s2).distinct().forEach(System.out::println);
		Stream.concat(list.stream().limit(4), list.stream().skip(2)).
				distinct().
				forEach(System.out::println);
	}
}
