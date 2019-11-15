package com.itheima.day_02.animals;

public class Pig extends Animals {

	public Pig() {
	}

	public Pig(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("eating vegetable...");
	}
}
