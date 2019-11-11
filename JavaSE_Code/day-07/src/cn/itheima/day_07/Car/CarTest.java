package cn.itheima.day_07.Car;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();

		car.setBrand("BMW");
		car.setColor("基佬紫");
		car.setPrice(300);

		car.run();

		Car car1 = new Car();

		car1.setBrand("Carl Bench");
		car1.setColor("silver");
		car1.setPrice(250);

		car1.run();

		Car car2 = new Car("五菱",10,"蓝");
		car2.run();
	}
}
