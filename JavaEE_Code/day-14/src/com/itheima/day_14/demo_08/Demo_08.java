package com.itheima.day_14.demo_08;

import java.util.function.Function;

public class Demo_08 {

	public static void main(String[] args) {

		String s = "张三,23";

		convert(
				//要进行操作的字符串
				s,
				//截取年龄部分的字符串
				str -> s.split(",")[1],
				//将字符串转换为int类型
				Integer :: parseInt,
				//加70
				integer -> integer + 70
		);
	}

	private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
		int i = fun1.andThen(fun2).andThen(fun3).apply(s);
		System.out.println(i);
	}
}
