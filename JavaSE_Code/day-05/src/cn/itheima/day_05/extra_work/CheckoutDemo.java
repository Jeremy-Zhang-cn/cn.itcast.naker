package cn.itheima.day_05.extra_work;

import java.util.Scanner;

public class CheckoutDemo {

	/*
		假如你是超市的一名收银员,当顾客拿着两种商品结账的时候,
		你需要计算出这两种商品的总金额,并告诉顾客,他需要支付的总金额;
		请使用你学过的知识模拟以上的场景;

		已知条件:
			顾客挑选的两种商品分别是方便面一包2.5元,火腿肠一根,1.5元;
			(这两个商品仅体现数据值即可,不考虑单位 "元")
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一件商品的价格(元）：");
		double a = sc.nextDouble();
		System.out.println("请输入第一件商品的价格（元）：");
		double b = sc.nextDouble();

		System.out.println("需要支付金额：" + checkout(a, b) + "元");

	}

	//返回值类型为double, 参数类型为double
	private static double checkout(double a, double b) {
		return a + b;
	}
}
