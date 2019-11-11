package cn.itheima.day_07.homework.phone;

public class Phone {

	private String brand;
	private int price;

	public Phone() {
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

	void call() {
		System.out.println("正在使用价格为" + this.price + "元的" + brand + "品牌手机打电话...");
	}

	void sendMessage() {
		System.out.println("正在使用价格为" + this.price + "元的" + brand + "品牌手机发短信...");
	}

	void playGame() {
		System.out.println("正在使用价格为" + this.price + "元的" + brand + "品牌手机玩游戏...");
	}

}
