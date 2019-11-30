package com.itheima.day_13.demo_01;

public class Demo_01 {

	/*
		Lambda表达式
		(形参)： 相当于一个带形参的方法
		->: jdk8的新语法，代表指向
		{}: 内部为要执行的代码块
	 */
	public static void main(String[] args) {

		/*
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}).start();
		以上代码可以通过Lambda表达式简化为下边的代码：
		*/

		new Thread(() -> {
			System.out.println("hello");
		}).start();


		/*
			继续简化之后如下：
			new Thread( () -> System.out.println("hello")).start();
		 */
	}
}
