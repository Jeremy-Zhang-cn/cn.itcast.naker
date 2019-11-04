package cn.itheima.day_05;

import java.util.Scanner;

public class Demo_03_MethodTips {

	/*
		练习方法设计的两个明确：
		需求：
			设计一个方法，完成求两个小数的和。

		PLUS版：
			参数由键盘输入完成
	 */

	public static void main(String[] args) {
		//	System.out.println(getSum(2.2,3.3));	//调用方法，输入参数为两个小数

		Scanner sc = new Scanner(System.in);    //从键盘输入数据

		System.out.println("输入第一个小数：");
		double a = sc.nextDouble();
		System.out.println("输入第二个小数：");
		double b = sc.nextDouble();


		System.out.println("两数之和为： " + getSum(a, b));    //调用方法，输入两个参数  (输出调用，用于返回值不为void的方法，且仅仅为了查看方法调用结果的情况。)
		System.out.println("--------------");

		double sum = getSum(1.5, 2.1);    //赋值调用，推荐用于返回值不为void的方法
		System.out.println(sum);
		System.out.println("-------------");

		getSum2(1.5, 2.1);    //直接调用,只能用于返回值为void的方法
	}

	public static double getSum(double a, double b) {    //定义方法，需要两个double类型的参数

		return a + b;    //返回double类型

	}

	public static void getSum2(double a, double b) {

		System.out.println("两数之和为： " + (a + b));

	}
}
