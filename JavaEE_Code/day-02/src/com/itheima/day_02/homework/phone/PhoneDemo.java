package com.itheima.day_02.homework.phone;

public class PhoneDemo {

	/*
		根据需求完成代码:
    (1)定义一个手机类
        a.行为:打电话,发短信

    (2)定义一个接口IPlay
        a.行为:玩游戏

    (3)定义一个旧手机类继承手机类
        a.行为:继承父类的行为

    (4)定义一个新手机继承手机类实现IPlay接口
        a.行为:继承父类的行为,重写玩游戏方法

    (5)定义一个测试类
        a.在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
            在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
	 */
	public static void main(String[] args) {
		OldPhone oldPhone = new OldPhone();
		NewPhone newPhone = new NewPhone();

		usePhone(oldPhone);
		System.out.println("--------");
		usePhone(newPhone);

	}

	public static void usePhone(Phone phone) {

		/*if ((phone.getInstance()).toString().startsWith("com.itheima.day_02.homework.phone.NewPhone")) {
			phone.call();
			phone.sendMessage();
			((NewPhone) phone).playGame();
		} else {
			phone.call();
			phone.sendMessage();
		}*/

		phone.call();
		phone.sendMessage();
		if (phone instanceof NewPhone) {
			((NewPhone) phone).playGame();
		}

	}

}
