package com.itheima.day_01.homework.phone;

public class PhoneDemo {

	/*
		分析以下需求，并用代码实现
	要求:完成代码(按照标准格式写)，然后在测试类中测试。
		1.手机类Phone
		  属性:品牌brand,价格price
		  无参构造,有参构造
		  行为:打电话call,发短信sendMessage,玩游戏,playGame
		2.测试类
		  创建Phone类对象,调用Phone类中的方法

		  思考:假设所有的手机都有属性屏幕的尺寸(int size),
		  而且假设所有手机的屏幕尺寸为6,应该如何实现?
	 */
	public static void main(String[] args) {

		Phone.setSize(6);
		Phone p1 = new Phone("华为", 3999);
		Phone p2 = new Phone("小米", 2999);
		Phone p3 = new Phone("魅族", 1999);
		Phone p4 = new Phone("苹果", 5999);
		Phone p5 = new Phone("三星", 5999);

		System.out.println(p1.getBrand() + " ," + p1.getPrice() + " ," + Phone.getSize());
		p1.call();
		p1.sendMessage();
		p1.playGame();
		System.out.println(p2.getBrand() + " ," + p2.getPrice() + " ," + Phone.getSize());
		System.out.println(p3.getBrand() + " ," + p3.getPrice() + " ," + Phone.getSize());
		System.out.println(p4.getBrand() + " ," + p4.getPrice() + " ," + Phone.getSize());
		System.out.println(p5.getBrand() + " ," + p5.getPrice() + " ," + Phone.getSize());

	}

}
