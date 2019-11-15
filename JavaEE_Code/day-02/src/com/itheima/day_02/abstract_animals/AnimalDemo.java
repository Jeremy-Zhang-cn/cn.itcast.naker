package com.itheima.day_02.abstract_animals;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal animal1 = new Cat("Cat", 2, "orange");
		Animal animal2 = new Dog("Dog", 4, "black");

		System.out.println(animal1.getBreed() + " ," +
				animal1.getAge() + " ," + animal1.getColor());

		animal1.eat();
		animal1.bark();

		System.out.println("-----------");

		System.out.println(animal2.getBreed() + " ," +
				animal2.getAge() + " ," + animal2.getColor());
		animal2.eat();
		animal2.bark();
	}
}
