package cn.itheima.practice_1103;

import java.util.Random;

public class SimpleArrayDemo_01 {

	/*
	*在main方法中，定义一个长度为5的int类型数组，并使用随机数(1-100之间)为数组元素赋值
	*(1)打印输出数组的长度
	*(2)遍历输出每个元素
	*(3)求出元素值为偶数的个数。
	*(4)求出元素值为奇数的元素之和。

	 */
	public static void main(String[] args) {

		int[] arr = new int[5];
		Random rd = new Random();
		int evenCount = 0;
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddSum += arr[i];
			}
		}

		System.out.println("数组的长度为：" + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n",i,arr[i]);
		}

		System.out.printf("数组中偶数元素的个数为：%d\n", evenCount);
		System.out.printf("数组中所有奇数之和为:%d\n",oddSum);

	}
}
