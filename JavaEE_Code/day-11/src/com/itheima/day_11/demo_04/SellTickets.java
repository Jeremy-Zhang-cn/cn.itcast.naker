package com.itheima.day_11.demo_04;

public class SellTickets implements Runnable {

	private static int tickets = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {

			synchronized (obj) {
				if (tickets > 0) {

					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName() +
							"卖出了第" + tickets + "张票");
					tickets--;
				} else {
					System.out.println("票卖完了");
					break;
				}
			}

		}
	}
}
