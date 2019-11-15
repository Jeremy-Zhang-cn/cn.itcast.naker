package com.itheima.day_01.animals;

public class Cat extends Animals {

	public Cat() {
	}

	public Cat(String breed, String color) {
		super(breed, color);
	}

	@Override
	void eat() {
		System.out.println("eating fish");
	}

	@Override
	void bark() {
		System.out.println("meow");
	}

}
