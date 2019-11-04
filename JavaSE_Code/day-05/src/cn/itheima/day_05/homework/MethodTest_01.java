package cn.itheima.day_05.homework;

import java.util.Scanner;

public class MethodTest_01 {

	/*
		分析以下需求，并用代码实现(每个小需求都需要封装成方法)
		1.求两个整数之和
		2.求两个小数之和
		3.判断两个整数是否相等
		4.判断两个小数是否相等
		5.获取两个整数中较大的值
		6.获取两个小数中较大的值
		7.获取两个整数中较小的值
		8.获取两个小数中较小的值
		9.用一个方法获取两个整数中较大的值或较小的值
	 */
	public static void main(String[] args) {

		System.out.println(sum(1, 2));
		System.out.println(sum(1.0, 2.1));
		System.out.println(compare(1,2));
		System.out.println(compare(1.0,2.0));
		System.out.println(getMax(23,15));
		System.out.println(getMax(23.1,15.7));
		System.out.println(getMin(23,15));
		System.out.println(getMin(23.1,15.7));
		System.out.println(getNum(15,23));;
	}

	//1.求两个整数之和
	//返回值类型为int,两个参数类型也为int
	public static int sum(int a, int b) {
		return a + b;
	}

	//2.求两个小数之和
	//返回值类型为double,两个参数类型也为double
	public static double sum(double a, double b) {
		return a + b;
	}

	//3.判断两个整数是否相等
	//返回值类型为boolean,两个参数类型为int
	public static boolean compare(int a, int b) {
		return a == b;
	}

	//4.判断两个小数是否相等
	//返回值类型为boolean,两个参数类型为double
	public static boolean compare(double a, double b) {
		return a == b;
	}

	//5.获取两个整数中较大的值
	//返回值为int,两个参数类型为int
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	//6.获取两个小数中较大的值
	//返回值类型为double,两个参数类型为double
	public static double getMax(double a, double b) {
		return a > b ? a : b;
	}

	//7.获取两个整数中较小的值
	//返回值类型为int,两个参数类型为int
	public static int getMin(int a, int b) {
		return a < b ? a : b;
	}

	//8.获取两个小数中较小的值
	//返回值类型为double,两个参数类型为double
	public static double getMin(double a, double b) {
		return a < b ? a : b;
	}

	//9.用一个方法获取两个整数中较大的值或较小的值
	//返回值为void,两个参数为int类型
	public static int getNum(int a,int b) {

		Scanner sc = new Scanner(System.in);
		int choice,min,max;
		System.out.println("请选择: 1.最大值， 2.最小值");
		choice = sc.nextInt();
		switch (choice) {	//根据用户选择判断最大或者最小值

			case 1:
				return a > b ? a : b;

			case 2:
				return a < b ? a : b;

			default:
				System.out.println("输入有误");
				return -1; //输出-1代表输入值非法
		}

	}
}
