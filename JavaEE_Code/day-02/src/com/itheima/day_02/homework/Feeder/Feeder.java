package com.itheima.day_02.homework.Feeder;

public class Feeder {

	public void feed(Animal animal) {

		animal.drink();
		animal.eat();
		if (animal instanceof Dog) {
			((Dog) animal).swim();
		} else if (animal instanceof Frog) {
			((Frog) animal).swim();
		}
	}
}
