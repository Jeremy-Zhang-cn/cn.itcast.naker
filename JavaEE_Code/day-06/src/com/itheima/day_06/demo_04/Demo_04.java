package com.itheima.day_06.demo_04;

public class Demo_04 {

	/*
		泛型的使用

	 */
	public static void main(String[] args) {

		Student<String> student = new Student<>();
		student.setT("张三");
		System.out.println(student.getT());

	}
}
