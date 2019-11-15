package com.itheima.day_02.homework.phone;

public class OldPhone extends Phone {

	@Override
	void call() {
		System.out.println("旧手机打电话。。。");
	}

	@Override
	void sendMessage() {
		System.out.println("旧手机发短信。。。");
	}


}
