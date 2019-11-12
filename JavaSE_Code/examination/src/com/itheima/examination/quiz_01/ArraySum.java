package com.itheima.examination.quiz_01;

public class ArraySum {

	/*
		定义一个int类型的数组，元素为
		{171, 172, 19, 16, 117, 51, 210, 7, 718},
		遍历数组筛选出元素为奇数且个位和十位都不包含7的元素，并求出符合条件的元素的总和。
	 */
	public static void main(String[] args) {

		int[] arr = {171, 172, 19, 16, 117, 51, 210, 7, 718};
		int sum = 0;

		for (int i : arr) {

			int singleDigit = i % 10;
			int tensDigit = i / 10 % 10;

			if (i % 2 != 0 && singleDigit % 7 != 0 && tensDigit % 7 != 0) {
				sum += i;
			}
		}

		System.out.println("符合条件元素的总和为：" + sum);

	}
}
