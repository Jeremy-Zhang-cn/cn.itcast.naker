package com.itheima.day_14.demo_03;


import java.util.function.Consumer;

public class Demo_03 {

	/*
		Consumer接口:也被称为消费性接口，它消费的数据的数据类型由泛型制定
			Consumer<T>: 包含两个方法
				void accept (T t):对给定的参数执行此操作
				default Consumer<T> andThen (Consumer after): 返回一个组合的Consumer一次执行此操作,
				然后执行after操作

	 */
	public static void main(String[] args) {

	//	operatorString("张三", s -> System.out.println(s));
		operatorString("张三", System.out::println);
		System.out.println("~~~~~~~~~~~");

		operatorString("张三", System.out::println, s ->
			System.out.println(new StringBuilder(s).reverse().toString()));
	}

	//定义一个方法，用不同的方式消费同一个字符串两次
	private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
		con1.andThen(con2).accept(name);
	}

	//定义一个方法，消费一个字符串数据
	private static void operatorString(String name, Consumer<String> con) {
		con.accept(name);
	}
}
