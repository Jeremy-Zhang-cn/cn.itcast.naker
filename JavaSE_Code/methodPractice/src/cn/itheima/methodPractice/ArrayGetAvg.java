package cn.itheima.methodPractice;

import java.util.Random;

public class ArrayGetAvg {

	/*
		(1)	定义方法public static int getAvg(int[] arr)，获取数组中的平均数并返回；
		(2)	在main方法内，定义长度为10的int数组，使用随机数赋值，并调用getAvg方法获取平均分。然后遍历数组，统计高于平均分的分数有多少个。
		打印结果：高于平均分：80 的个数有 5 个。

	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}

		int avg = getAvg(arr);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				count++;
			}

		}
			System.out.printf("高于平均分%d的个数有%d个",avg, count);
	}

	private static int getAvg(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}
}
