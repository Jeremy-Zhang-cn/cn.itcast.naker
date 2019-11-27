package com.itheima.day_11.demo_03;

public class Demo_03 {

	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();

		//Thread(Runnable target, String name)
		new Thread(mr, "线程1").start();
		new Thread(mr, "线程2").start();

	}
}
