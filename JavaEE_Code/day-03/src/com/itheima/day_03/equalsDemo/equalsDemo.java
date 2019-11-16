package com.itheima.day_03.equalsDemo;

public class equalsDemo {

	public static void main(String[] args) {

		Student student1 = new Student("张三", 18);
		Student student2 = new Student("张三", 18);

		System.out.println(student1.equals(student2));
		System.out.println(student1);	//类中重写toString()方法，使之不会打印出哈希值而是打印出对象的具体内容

	}
}
