package com.itheima.day_14.demo_11;

public class Actor {

	private String name;

	public Actor() {
	}

	public Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"name='" + name + '\'' +
				'}';
	}
}
