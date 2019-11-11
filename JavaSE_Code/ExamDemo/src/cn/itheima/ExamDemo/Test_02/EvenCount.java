package cn.itheima.ExamDemo.Test_02;

import java.util.Random;

public class EvenCount {

	/*
		获取一个2-100之间（包含2和100）的随机数n, 统计2-n之间
		（包含2和n）偶数的个数，并将符合条件的数字和个数打印输出至控制台
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(99) + 2;
		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("符合条件的数字共" + count + "个");
	}
}
