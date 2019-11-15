package com.itheima.day_01.homework.student;

public class Teacher extends Person {

	public Teacher() {
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		super.eat();
	}

	void teach() {
		System.out.println("teaching...");
	}
}
