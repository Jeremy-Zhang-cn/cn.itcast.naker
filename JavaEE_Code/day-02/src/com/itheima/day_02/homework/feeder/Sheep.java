package com.itheima.day_02.homework.feeder;

public class Sheep extends Animal {

	@Override
	void eat() {
		System.out.println("羊啃草");
	}

	@Override
	void drink() {
		System.out.println("羊喝水");
	}
}
