package com.itheima.day_03.MathDemo;

import com.sun.security.jgss.GSSUtil;

public class Demo {

	public static void main(String[] args) {

		//取绝对值
		System.out.println(Math.abs(-23));
		System.out.println(Math.abs(23));
		System.out.println("------------");

		//取两数中的最大值
		//public static int max(int a, int b)
		System.out.println(Math.max(2, 5));
		System.out.println("------------");

		//取两数中的最小值
		System.out.println(Math.min(2, 5));
		System.out.println("------------");

		//向上取整
		System.out.println(Math.ceil(12.3));
		System.out.println(Math.ceil(12.6));
		System.out.println("------------");

		//向下取整
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.6));
		System.out.println("------------");

		//求a的b次幂
		//public static double pow(double a, double b)
		System.out.println(Math.pow(3.0, 3.0));
		System.out.println("------------");

		//四舍五入
		System.out.println(Math.round(12.3));
		System.out.println(Math.round(12.6));
		System.out.println("------------");

		//求随机数，随机的范围是[0.0, 1.0)
		System.out.println(Math.random());

		//圆周率
		System.out.println(Math.PI);
	}
}
