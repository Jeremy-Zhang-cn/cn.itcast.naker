package com.itheima.day_02.homework.usb;

public class Mouse implements USBInter {

	@Override
	public void turnOn() {
		System.out.println("连接鼠标的USB");
	}

	@Override
	public void turnOff() {
		System.out.println("断开鼠标的USB");
	}

}
