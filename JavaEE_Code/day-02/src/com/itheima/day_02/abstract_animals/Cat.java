package com.itheima.day_02.abstract_animals;

public class Cat extends Animal {

	public Cat() {
	}

	public Cat(String breed, int age, String color) {
		super(breed, age, color);
	}

	@Override
	public void eat() {
		System.out.println("eating fish...");
	}

	@Override
	public void bark() {
		System.out.println("meow");
	}

}
