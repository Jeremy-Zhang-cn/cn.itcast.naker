package com.itheima.day_14.demo_07;

import java.util.function.Function;

public class Demo_07 {

	public static void main(String[] args) {

	//	convert("233", s -> Integer.parseInt(s));
		convert("233", Integer::parseInt);

		convert(233 , integer -> String.valueOf(integer + 233));

		convert("566", Integer::parseInt, integer -> String.valueOf(integer + 100));
	}

	//定义一个方法，把一个字符串转化成int类型，在控制台输出
	private static void convert(String s, Function<String, Integer> fun) {

		int i = fun.apply(s);
		System.out.println(i);
	}

	//定义一个方法，把一个int类型的数据加上一个整数之后，转为字符串在控制台输出
	private static void convert(int i, Function<Integer, String> fun) {
		String s = fun.apply(i);
		System.out.println(s);
	}

	//定义一个方法，把一个字符串转换成int类型之后把int类型的数据加上一个整数之后，转换为字符串在控制台输出
	private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {

		/*int i = fun1.apply(s);
		String str = fun2.apply(i);
		System.out.println(str);*/

		String str = fun1.andThen(fun2).apply(s);
		System.out.println(str);
	}
}
