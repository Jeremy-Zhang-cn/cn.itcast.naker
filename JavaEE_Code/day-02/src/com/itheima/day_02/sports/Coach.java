package com.itheima.day_02.sports;

public abstract class Coach extends Person {

	public Coach() {
	}

	public Coach(String name, int age) {
		super(name, age);
	}

	public abstract void teach();

}
