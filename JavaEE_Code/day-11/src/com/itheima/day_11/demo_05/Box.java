package com.itheima.day_11.demo_05;

public class Box {

	private int milk;	//表示第x瓶奶
	private boolean state = false;	//表示奶箱中是否有奶

	public Box() {
	}

	//存牛奶操作
	synchronized void put(int milk) {

		if (state) {	//如果奶箱中有奶，等待消费者消费
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.milk = milk;
		System.out.println("送奶工正在将第" + this.milk + "瓶奶装入奶箱");

		state = true;
		notifyAll();	//唤醒其他所有等待线程
	}

	//取牛奶操作
	synchronized void get() {

		if (!state) {	//如果奶箱中没有奶，等待生产者生产
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("用户取出了第" + this.milk + "瓶奶");
		state = false;	//消费完毕后更改状态
		notifyAll();	//唤醒其他所有等待线程

	}
}
