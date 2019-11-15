package com.itheima.day_02.animals;

public class Animals {

	private int age;
	private String name;

	public Animals() {
	}

	public Animals(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("eating");
	}

}
