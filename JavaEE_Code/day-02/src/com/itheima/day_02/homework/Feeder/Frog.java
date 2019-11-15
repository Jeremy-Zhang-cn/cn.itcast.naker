package com.itheima.day_02.homework.Feeder;

public class Frog extends Animal implements Swimming {

	@Override
	void eat() {
		System.out.println("青蛙吃小虫");
	}

	@Override
	void drink() {
		System.out.println("青蛙喝水");
	}

	@Override
	public void swim() {
		System.out.println("青蛙会蛙泳");
	}

}
