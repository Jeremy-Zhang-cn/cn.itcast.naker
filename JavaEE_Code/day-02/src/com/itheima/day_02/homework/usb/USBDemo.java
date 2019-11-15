package com.itheima.day_02.homework.usb;

public class USBDemo {

	/*
		分析以下需求，并用代码实现
    进行描述笔记本类，实现笔记本使用USB鼠标(Mouse)、USB键盘(Keyboard)
     (1) a.USB接口:
            开启功能
            关闭功能

        b.笔记本类:
            开机功能
            关机功能
		c.笔记本中定义使用USB设备的功能 接口作为方法的参数和返回值
           要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能

    (3)鼠标类(Mouse):
        要符合USB接口

    (4)键盘类(KeyBoard):
        要符合USB接口

    (5)测试类:
        创建电脑对象,依次调用开机方法,使用USB设备, 关机方法

    (6)打印效果如下:
        开机
        连接鼠标的USB
        断开鼠标的USB
        连接键盘的USB
        断开键盘的USB
        关机
	 */
	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		Mouse mouse = new Mouse();
		KeyBoard keyBoard = new KeyBoard();

		laptop.powerOn();
		laptop.useUSB(mouse);
		laptop.useUSB(keyBoard);
		laptop.powerOff();
	}
}
