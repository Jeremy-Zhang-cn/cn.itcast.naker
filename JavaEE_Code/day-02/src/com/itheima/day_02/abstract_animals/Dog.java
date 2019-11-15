package com.itheima.day_02.abstract_animals;

public class Dog extends Animal {

	public Dog() {
	}

	public Dog(String breed, int age, String color) {
		super(breed, age, color);
	}

	@Override
	public void eat() {
		System.out.println("eating bone...");
	}

	@Override
	public void bark() {
		System.out.println("woof");
	}

}
