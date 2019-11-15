package com.itheima.day_01.animals;

public class Dog extends Animals {

	public Dog() {
	}

	public Dog(String breed, String color) {
		super(breed, color);
	}

	@Override
	void eat() {
		System.out.println("eating bone");
	}

	@Override
	void bark() {
		System.out.println("woof");
	}

}
