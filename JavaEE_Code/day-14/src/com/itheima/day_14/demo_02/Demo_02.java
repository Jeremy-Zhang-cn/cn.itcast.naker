package com.itheima.day_14.demo_02;

import java.util.function.Supplier;

public class Demo_02 {

	/*
		使用Supplier获取数组中的最大值
	 */
	public static void main(String[] args) {

		int[] array = {19, 20, 31, 40, 56, 10};

		int maxValue = getMax(() -> {

			int max = array[0];

			for (int value : array) {
				max = Math.max(max, value);
			}
			return max;
		});

		System.out.println(maxValue);
	}

	private static int getMax(Supplier<Integer> sup) {
		return sup.get();
	}
}
