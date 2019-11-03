package cn.itheima.practice_1103;

import java.util.Scanner;

/*
*声明一个int类型变量x,并通过键盘输入为x赋值，然后在控制台打印输出x的值。
 */
public class InputDemo {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");

		x = sc.nextInt();

		System.out.println(x);
	}
}
