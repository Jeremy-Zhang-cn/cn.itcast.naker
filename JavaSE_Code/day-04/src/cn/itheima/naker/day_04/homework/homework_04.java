package cn.itheima.naker.day_04.homework;

import java.util.Random;

public class homework_04 {

	/*
		 (1)定义一个长度为10的int类型数组，元素值使用随机数生成（范围为50-80）
		 (2)打印该数组中满足个位和十位不包含7的元素。
	 */
	public static void main(String[] args) {

		Random rd = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(31) + 50;
		}

		for (int i = 0; i < arr.length; i++) {

			int a = arr[i] % 10;	//获取个位数
			int b = arr[i] / 10;	//获取十位数

			if (a != 7 && b != 7) {

				System.out.println(arr[i]);

			}
		}
	}
}
