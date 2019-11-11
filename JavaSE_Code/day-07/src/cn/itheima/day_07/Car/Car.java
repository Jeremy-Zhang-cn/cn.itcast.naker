package cn.itheima.day_07.Car;

class Car {

	private String brand;
	private double price;
	private String color;

	//空参构造
	Car() {
		System.out.println("调用无参构造方法");
	}

	//全参构造
	Car(String brand, double price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void run() {
		System.out.println(this.getPrice() + "万元的" + this.getColor() +
				"色的" + this.getBrand() + "正在飞奔。。");
	}
}
