package com.itheima.day_06.homework.Demo_02;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public int compareTo(Person person) {
		int nameDiff = this.name.compareTo(person.name);
		return nameDiff == 0 ? this.age - person.age : nameDiff;
	}
}
