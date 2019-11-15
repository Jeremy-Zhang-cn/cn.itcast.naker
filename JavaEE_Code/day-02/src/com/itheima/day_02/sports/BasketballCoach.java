package com.itheima.day_02.sports;

public class BasketballCoach extends Coach {

	public BasketballCoach() {
	}

	public BasketballCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("教授篮球技巧。。。");
	}

	@Override
	public void eat() {
		System.out.println("篮球教练正在吃饭。。。");
	}
}
