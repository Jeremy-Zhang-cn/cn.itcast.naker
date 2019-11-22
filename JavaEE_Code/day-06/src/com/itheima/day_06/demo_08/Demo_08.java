package com.itheima.day_06.demo_08;

public class Demo_08 {

	//可变参数
	public static void main(String[] args) {

		System.out.println(sum(10, 20, 30));

	}

	private static int sum(int... a) {    //有可变参数的方法如果存在多个参数，需要把另外的参数写在可变参数前
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	private static int multiply(int b, int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum * b;
	}
}
