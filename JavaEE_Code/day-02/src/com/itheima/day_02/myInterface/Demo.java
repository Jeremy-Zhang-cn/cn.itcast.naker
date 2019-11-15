package com.itheima.day_02.myInterface;

public class Demo {

	public static void main(String[] args) {

		//使用多态方式创建对象
		Jumping cat = new JumpingImpl_Cat();
		cat.jumping();

		System.out.println("----------");

		//创建实现类的对象
		JumpingImpl_Cat cat1 = new JumpingImpl_Cat("Puss", 2);
		System.out.println(cat1.getName() + " ," + cat1.getAge());
		cat1.eat();
		cat1.jumping();

		System.out.println("----------");

		Dog dog = new Dog("Doug",4);
		System.out.println(dog.getName() + " ," + dog.getAge());
		dog.eat();
		dog.jumping();

	}
}
