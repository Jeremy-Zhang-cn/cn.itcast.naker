package cn.itheima.day_07.homework.phone;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone("华为",1999);

		p1.setBrand("小米");
		p1.setPrice(1888);

		p1.call();
		p1.sendMessage();
		p1.playGame();

		System.out.println("---------------");

		p2.call();
		p2.sendMessage();
		p2.playGame();

	}
}
