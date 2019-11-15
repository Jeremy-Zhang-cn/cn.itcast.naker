package com.itheima.day_02.animals;

public class Cat extends Animals {

	public Cat() {
	}

	public Cat(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("eating fish...");
	}

	public void drink() {
		System.out.println("drinking milk...");
	}
}
