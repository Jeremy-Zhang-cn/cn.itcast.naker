package cn.itheima.practice_1103;

import java.util.Scanner;
/*
*声明两个int类型变量，并通过键盘录入为变量赋值，
* 然后求出两变量之和，在控制台打印输出结果
 */
public class SimpleSumDemo {

	public static void main(String[] args) {

		int x, y, sum;
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数字：");
		x = sc.nextInt();
		System.out.println("请输入第二个数字");
		y = sc.nextInt();

		sum = x + y;
		System.out.println("两数之和为：" + sum);
	}
}
