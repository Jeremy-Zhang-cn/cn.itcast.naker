package com.itheima.day_13.demo_03;

public class Demo_03 {

	public static void main(String[] args) {

		useFlyable(new Flyable() {
			@Override
			public void fly(String s) {
				System.out.println(s);
				System.out.println("contemplate");
			}
		});

		System.out.println("~~~~~~~~~~~~~~");

		useFlyable((String s) -> {
			System.out.println(s);
			System.out.println("contemplate");
		});
	}

	public static void useFlyable(Flyable f) {
		f.fly("exclusively, elusive");
	}
}
