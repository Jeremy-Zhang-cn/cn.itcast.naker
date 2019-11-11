package cn.itheima.ExamDemo.Test_02;

public class Ecar {

	private String brand;
	private int price;
	private int mile;

	public Ecar() {
	}

	public Ecar(String brand, int price, int mile) {
		this.brand = brand;
		this.price = price;
		this.mile = mile;
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

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}
}
