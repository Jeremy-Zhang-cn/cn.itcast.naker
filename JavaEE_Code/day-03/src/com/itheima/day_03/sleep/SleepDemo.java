package com.itheima.day_03.sleep;

public class SleepDemo {

	public static void main(String[] args) {
		usePerson(new PassengerA());
		System.out.println("-------------");
		usePerson(getPerson());
	}

	private static void usePerson(Person person) {
		//在调用时相当于多态形式的 Person person = new PassengerA();
		person.sleep();

	}

	private static Person getPerson() {

		return new PassengerB();

	}

}
