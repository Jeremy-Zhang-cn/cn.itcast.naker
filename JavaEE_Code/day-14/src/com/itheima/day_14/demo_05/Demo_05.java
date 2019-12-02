package com.itheima.day_14.demo_05;

import java.util.function.Predicate;

public class Demo_05 {

	/*
		Predicate<T>: 常用的方法：
			boolean test(T t): 对给定的参数进行判断（判断逻辑有Lambda表达式实现），返回一个布尔值
			default Predicate<T> negate(): 返回一个逻辑的否定，对应逻辑非
			Predicate <T> 接口通常用于判断参数是否满足指定的条件
	 */
	public static void main(String[] args) {

/*

		checkString("hello", new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.length() > 8;
			}
		});
*/
		System.out.println(checkString("hello", (s) -> s.length() > 8));

	}

	//判断给定的字符串是否满足要求
	/*
		negate方法相当于！
		and方法相当于&&
		or 方法相当于 ||

	 */

	private static boolean checkString(String s, Predicate<String> pre) {

	//	return pre.test(s);
	//	return !pre.test(s);

		return pre.negate().test(s);
	}
}
