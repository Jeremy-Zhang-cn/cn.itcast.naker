package com.itheima.day_02.abstract_animals;

public abstract class Animal {

	private String breed;
	private int age;
	private String color;

	public Animal() {
	}

	public Animal(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void eat();
	public abstract void bark();

}
