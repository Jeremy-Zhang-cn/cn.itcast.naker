package com.itheima.day_13.demo_02;

public class Demo_02 {

	public static void main(String[] args) {

		useEdible(new Edible() {
			@Override
			public void eat() {
				System.out.println("The future's arrived, it commences now.");
			}
		});

		useEdible(() -> {
					System.out.println("The future's arrived, it commences now.");
				});
	}

	public static void useEdible(Edible e) {
		e.eat();
	}
}
