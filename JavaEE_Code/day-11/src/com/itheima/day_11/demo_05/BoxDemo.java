package com.itheima.day_11.demo_05;

public class BoxDemo {

	/*
		生产者消费者案例
	 */
	public static void main(String[] args) {

		Box b = new Box();

		Producer p = new Producer(b);
		Consumer c = new Consumer(b);

		new Thread(p, "生产者").start();
		new Thread(c, "消费者").start();


	}
}
