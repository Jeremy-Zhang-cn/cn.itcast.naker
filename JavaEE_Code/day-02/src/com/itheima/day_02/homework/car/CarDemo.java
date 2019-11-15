package com.itheima.day_02.homework.car;

public class CarDemo {

	/*
		老司机开车案例.
	1.定义一个汽车类Car.有一个抽象方法run().
	2.定义一个小客车BabyCar类继承Car类;
	3.定义一个公交车类Bus继承Car类
	4.在测试类中定义一个方法.//把Xxx修改成具体类型.
	public static void dirverCar(Xxx x){
		x.run();
	}
	调用dirverCar方法.要求任何一种类型的车都可以开起来.
	 */
	public static void main(String[] args) {

		BabyCar babyCar = new BabyCar();
		Bus bus = new Bus();
		driveCar(babyCar);
		System.out.println();
		driveCar(bus);

	}

	public static void driveCar(Car car) {
		car.run();
	}
}
