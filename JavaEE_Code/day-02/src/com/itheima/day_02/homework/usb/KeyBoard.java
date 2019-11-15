package com.itheima.day_02.homework.usb;

public class KeyBoard implements USBInter {

	@Override
	public void turnOn() {
		System.out.println("连接键盘的USB");
	}

	@Override
	public void turnOff() {
		System.out.println("断开键盘的USB");
	}

}
