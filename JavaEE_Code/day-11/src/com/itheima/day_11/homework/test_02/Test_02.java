package com.itheima.day_11.homework.test_02;

public class Test_02 {

	/*
		使用多线程解决以下问题
			有一个包包的数量为100个。分别从实体店和官网进行售卖！
			要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
			分别统计官网和实体店各卖出了多少个包包
			例如：
				官网共卖出了45个
				实体店共卖出了55个
	 */
	public static void main(String[] args) {

		SellBag sb = new SellBag();

		new Thread(sb, "官网").start();
		new Thread(sb, "实体店").start();

	}
}
