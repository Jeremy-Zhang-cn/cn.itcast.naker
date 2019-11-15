package com.itheima.day_01.person;

public class Teacher extends Person {

	public Teacher() {
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	void teach() {
		System.out.println("教学");
	}
}
