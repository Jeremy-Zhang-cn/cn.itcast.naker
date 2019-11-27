package com.itheima.day_11.demo_04;

public class SellTicketsDemo {

	/*
		售票案例
	 */
	public static void main(String[] args) {

		SellTickets st = new SellTickets();

		new Thread(st, "窗口1").start();
		new Thread(st, "窗口2").start();
		new Thread(st, "窗口3").start();


	}
}
