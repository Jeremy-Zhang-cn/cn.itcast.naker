package com.itheima.day_02.animals;

public class AnimalsDemo {

	public static void main(String[] args) {

		AnimalsOperator ao = new AnimalsOperator();
		Cat c = new Cat(3,"Kitty");
		Dog d = new Dog(4,"Dogie");
		Pig p = new Pig(2,"Page");
		Animals an = new Cat(1, "puss");

		((Cat)an).drink();
		ao.operator(c);
		ao.operator(d);
		ao.operator(p);


	}

}
