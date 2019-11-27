package com.itheima.day_11.demo_02;

public class Demo_02 {

	public static void main(String[] args) {

		new Thread("线程1") {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName() + " ：数据结构");
				}

			}
		}.start();


		Thread mt2 = new Thread("线程2") {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName() + " ：计算机网络");
				}

			}

		};
		mt2.start();

		//获取当前线程 Thread.currentThread()
		System.out.println(Thread.currentThread().getName());

	}

}
