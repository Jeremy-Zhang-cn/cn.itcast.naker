package com.itheima.day_02.homework.phone;

public class NewPhone extends Phone implements IPlay {

	@Override
	void call() {
		System.out.println("新手机打电话。。。");
	}

	@Override
	void sendMessage() {
		System.out.println("新手机发短信。。。");
	}

	@Override
	public void playGame() {
		System.out.println("玩游戏。。。");
	}

}
