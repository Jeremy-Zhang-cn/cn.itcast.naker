package com.itheima.day_03.homework.Demo_01;

public class Outer {

	public static Inter method() {

		return new Inter(){
			@Override
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}
