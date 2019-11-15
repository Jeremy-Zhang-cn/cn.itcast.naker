package com.itheima.day_01.homework.student;

public class Student extends Person {

	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		super.eat();
	}

	void study() {
		System.out.println("studying...");
	}
}
