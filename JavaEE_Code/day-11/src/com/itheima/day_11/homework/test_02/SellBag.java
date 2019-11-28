package com.itheima.day_11.homework.test_02;

public class SellBag implements Runnable {

	private int bagCount = 100;
	private Object obj = new Object();


	@Override
	public void run() {

		int count = 0;
		while (true) {

			synchronized (obj) {

				if (bagCount > 0) {

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					bagCount--;
					count++;
				} else {
				//	System.out.println("卖完了");
					System.out.println(Thread.currentThread().getName() +
							"共卖出了" + count + "个包");
					break;
				}
			}

		}

	}
}
