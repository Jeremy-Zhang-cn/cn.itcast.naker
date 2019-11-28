package com.itheima.day_11.demo_05;

public class Producer implements Runnable {

	Box b;

	public Producer() {
	}

	public Producer(Box b) {
		this.b = b;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			b.put(i);
		}
	}

}
