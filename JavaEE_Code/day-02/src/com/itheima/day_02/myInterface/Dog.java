package com.itheima.day_02.myInterface;

public class Dog extends Animals implements Jumping {

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("Eating bone...");
	}

	@Override
	public void jumping() {
		System.out.println("dog is jumping");
	}
}
