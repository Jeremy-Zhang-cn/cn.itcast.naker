package com.itheima.day_11.demo_01;

public class Demo_01 {

	public static void main(String[] args) {

		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();

		//启动线程
		m1.start();
		m2.start();
	}
}
