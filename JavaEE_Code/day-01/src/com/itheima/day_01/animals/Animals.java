package com.itheima.day_01.animals;

public class Animals {

	private String breed;
	private String color;

	public Animals() {
	}

	public Animals(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void eat() {
		System.out.println("eating");
	}

	void bark() {
		System.out.println("barking");
	}
}
