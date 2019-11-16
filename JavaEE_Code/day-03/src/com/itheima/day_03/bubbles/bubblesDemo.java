package com.itheima.day_03.bubbles;

import java.util.Arrays;

public class bubblesDemo {

	/*
		冒泡排序
	 */
	public static void main(String[] args) {

		int[] arr = {11, 12, 33, 45, 54, 99, 87, 90};

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				swap(arr, j);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int j) {
		if (arr[j] > arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
	}

}
