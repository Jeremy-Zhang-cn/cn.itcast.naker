package com.itheima.day_02.animals;

public class Dog extends Animals {

	public Dog() {
	}

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("eating bone...");
	}
}
