package com.itheima.day_13.demo_04;

public class Demo_04 {

	public static void main(String[] args) {

		useAddable((int x, int y) -> {
			return x + y;
		});

		/*
		可简化为：
		useAddable((x, y) -> x + y);
		 */
	}

	public static void useAddable(Addable a) {
		int add = a.add(10, 20);
		System.out.println(add);
	}
}
