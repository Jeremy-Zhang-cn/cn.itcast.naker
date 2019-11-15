package com.itheima.day_01.person;

class Student extends Person {

	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	void study() {
		System.out.println("学习");
	}
}
