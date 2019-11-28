package com.itheima.day_11.demo_05;

public class Consumer implements Runnable {

	Box b;

	public Consumer(Box b) {
		this.b = b;
	}

	public Consumer() {
	}

	@Override
	public void run() {

		while (true) {
			b.get();
		}
	}

}
