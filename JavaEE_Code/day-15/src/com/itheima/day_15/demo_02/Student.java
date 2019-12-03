package com.itheima.day_15.demo_02;

public class Student {

	private String name;
	private int age;

	public Student() {
	}

	private Student(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void function() {
		System.out.println("function");
	}

	public void method1() {
		System.out.println("method1");
	}

	public String method2(String s, int i) {
		return s + "," + i;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
