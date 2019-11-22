package com.itheima.day_02.homework.feeder;

public class Dog extends Animal implements Swimming {

	@Override
	void eat() {
		System.out.println("狗啃骨头");
	}

	@Override
	void drink() {
		System.out.println("狗喝水");
	}

	@Override
	public void swim() {
		System.out.println("狗会狗刨游泳");
	}
}
