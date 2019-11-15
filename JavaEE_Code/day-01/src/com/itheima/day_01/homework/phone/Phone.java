package com.itheima.day_01.homework.phone;

public class Phone {

	private String brand;
	private int price;
	private static int size;

	public Phone() {
	}

	public Phone(String brand, int price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Phone.size = size;
	}

	public void call() {
		System.out.println("calling...");
	}

	public void sendMessage() {
		System.out.println("sending message...");
	}

	public void playGame() {
		System.out.println("playing game...");
	}
}
