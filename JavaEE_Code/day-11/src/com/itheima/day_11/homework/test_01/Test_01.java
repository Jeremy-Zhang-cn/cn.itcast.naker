package com.itheima.day_11.homework.test_01;

public class Test_01 {

	/*
		分析以下需求，并用代码实现
			一共有1000张电影票,可以在两个窗口领取,
			假设每次领取的时间为3000毫秒,
		要求:
			请用多线程模拟卖票过程并打印剩余电影票的数量
	 */
	public static void main(String[] args) {

		MovieTicket movieTicket = new MovieTicket();

		new Thread(movieTicket, "窗口1").start();
		new Thread(movieTicket, "窗口2").start();

	}
}
