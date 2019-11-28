package com.itheima.day_11.homework.test_01;

public class MovieTicket implements Runnable {

	private int tickets = 1000;
	private Object o = new Object();

	@Override
	public void run() {
		while (true) {

			synchronized (o) {
				if (tickets > 0) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					tickets--;
					System.out.println(Thread.currentThread().getName() +
							"卖出一张票，还剩下" + tickets + "张票");
				} else {
					System.out.println("票卖完了");
					break;
				}
			}
		}
	}
}
