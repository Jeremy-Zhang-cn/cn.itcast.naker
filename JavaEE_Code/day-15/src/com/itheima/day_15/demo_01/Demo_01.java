package com.itheima.day_15.demo_01;

public class Demo_01 {

	/*
		Class对象
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		//作为一个方法的参数进行传递
		Class<Student> c1 = Student.class;
		System.out.println(c1);

		Class<Student> c2 = Student.class;
		System.out.println(c1 == c2);
		System.out.println("~~~~~~~~~~~~");

		//调用对象的getClass（）方法，返回该对象所对应的Class对象
		Student s = new Student();
		Class<? extends Student> c3 = s.getClass();
		System.out.println(c1 == c3);
		System.out.println("~~~~~~~~~~~~~");

		//使用Class类中的静态方法forName（String className）
		Class<?> c4 = Class.forName("com.itheima.day_15.demo_01.Student");
		System.out.println(c1 == c4);

	}
}
