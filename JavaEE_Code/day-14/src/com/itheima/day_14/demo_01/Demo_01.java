package com.itheima.day_14.demo_01;

import java.util.function.Supplier;

public class Demo_01 {

	public static void main(String[] args) {

		getString(new Supplier<String>() {
			@Override
			public String get() {
				return "23333";
			}
		});

		String s = getString(() -> "2333");
		System.out.println(s);


	}

	public static String getString(Supplier<String> sup) {
		return sup.get();
	}
}
