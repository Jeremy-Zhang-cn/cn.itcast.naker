package com.itheima.day_02.homework.usb;

public class Laptop {

	public void powerOn() {
		System.out.println("开机");
	}

	public void powerOff() {
		System.out.println("关机");
	}

	public void useUSB(USBInter usbInter) {
		usbInter.turnOn();
		usbInter.turnOff();
	}
}
