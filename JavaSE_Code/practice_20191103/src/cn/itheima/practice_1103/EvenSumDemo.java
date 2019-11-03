package cn.itheima.practice_1103;

import java.util.Random;

public class EvenSumDemo {

	/*
	 *获取一个1-500之间(包含1和500)的随机数n，
	 * 求0-n之间（包含0和n）的偶数和，并打印到控制台上;
	 */
	public static void main(String[] args) {

		int n;
		Random rd = new Random();

		n = rd.nextInt(500) + 1;

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("0~%d之间的偶数和为：%d", n, sum);
	}
}
