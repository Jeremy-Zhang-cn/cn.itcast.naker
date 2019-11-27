package com.itheima.day_08.demo_06;

public class Factorial {

	/*
		递归调用：
			求阶乘
			n的阶乘等于n乘以n-1的阶乘
			3！ = 3 * 2！
				2！ = 2 * 1！
					1！ = 1	//递归的出口
	 */
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int n) {

		if (n == 0 || n == 1) return 1;	//递归的出口

		return (n * factorial(n - 1));

	}

}
