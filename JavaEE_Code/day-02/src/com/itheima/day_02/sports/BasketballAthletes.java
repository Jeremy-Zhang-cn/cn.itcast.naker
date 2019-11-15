package com.itheima.day_02.sports;

public class BasketballAthletes extends Athletes {

	public BasketballAthletes() {
	}

	public BasketballAthletes(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("学习篮球技巧。。。");
	}

	@Override
	public void eat() {
		System.out.println("篮球运动员正在吃饭");
	}
}
