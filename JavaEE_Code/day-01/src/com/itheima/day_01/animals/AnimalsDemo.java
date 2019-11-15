package com.itheima.day_01.animals;

public class AnimalsDemo {

	public static void main(String[] args) {

		Cat cat = new Cat("狸花猫", "花色");
		Dog dog = new Dog("博美犬", "白色");

		cat.eat();
		cat.bark();
		System.out.println("--------");
		dog.eat();
		dog.bark();

		Animals cat1 = new Cat("美国短毛猫", "黑白色");
		System.out.println("-------");
		cat1.bark();
		cat1.eat();
	}

}
