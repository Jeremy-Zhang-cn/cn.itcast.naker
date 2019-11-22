package com.itheima.day_03.innerClass;

public class Outer {

	private String name;

	public Outer(String name) {
		this.name = name;
	}

	public Outer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Inner {

		public void show() {
			System.out.println(name + " ,hi");
		}
	}
}
