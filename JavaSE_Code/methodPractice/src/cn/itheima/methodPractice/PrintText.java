package cn.itheima.methodPractice;

import java.util.Scanner;

public class PrintText {

	/*
		17、定义一个方法,可以接收1个整数n，
		在方法内循环打印n次“传智播客”。在main方法中调用该方法。
	 */
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入次数：");
		n = sc.nextInt();
		printText(n);
	}

	private static void printText(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("传智播客");
		}
	}
}
