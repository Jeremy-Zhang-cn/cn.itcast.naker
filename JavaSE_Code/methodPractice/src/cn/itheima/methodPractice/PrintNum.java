package cn.itheima.methodPractice;

import java.util.Scanner;

public class PrintNum {

	/*
		8、定义一个方法,可以接收一个整数，并将它打印到控制台。
		在main方法中调用该方法。（有参数无返回值）
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		int a = sc.nextInt();
		printNum(a);
	}

	private static void printNum(int a) {

		System.out.println(a);
	}
}
