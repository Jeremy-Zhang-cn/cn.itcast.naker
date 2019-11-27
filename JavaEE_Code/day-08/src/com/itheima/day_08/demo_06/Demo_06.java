package com.itheima.day_08.demo_06;

public class Demo_06 {

	/*
		递归调用
			fibonacci数列前n项和
				斐波那契数列的第n项等于第n-1项加上第n-2项
				eg. 第3项等于第2项加上第1项，第2项和第1项都为1
	 */
	public static void main(String[] args) {
		System.out.println(fibonacci(20));
	}

	private static int fibonacci(int n) {

		if (n == 1 || n == 2) return 1;	//递归的出口

		return fibonacci(n - 1) + fibonacci(n - 2);


	}
}
