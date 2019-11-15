package com.itheima.day_02.homework.animal;

public class Cat extends Animal {

	@Override
	void eat() {
		System.out.println("吃鱼");
	}

	void catchMouse() {
		System.out.println("抓老鼠");
	}
}
