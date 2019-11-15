package com.itheima.day_02.animals;

public class AnimalsOperator {

	public void operator(Animals animals) {

		System.out.print(animals.getName() + " ,"
				+ animals.getAge() + " ,");

		animals.eat();

	}
}
