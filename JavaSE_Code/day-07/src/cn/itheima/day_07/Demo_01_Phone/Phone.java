package cn.itheima.day_07.Demo_01_Phone;

public class Phone {

	private String brand;
	private int price;

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

	public void call() {
		System.out.println("calling");
	}

	public void sendMessage() {
		System.out.println("sending message");
	}
}
