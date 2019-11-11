package cn.itheima.day_07.homework.animals;

public class Cat extends Animals implements Bark {

	public Cat() {
		super();
	}

	public Cat(String color, String breed) {
		super(color,breed);
	}

	public void eat() {
		System.out.printf("%s色的%s猫正在吃鱼...\n", this.color, this.breed);
	}

	public void work() {
		System.out.printf("%s色的%s猫正在抓老鼠...\n", this.color, this.breed);
	}

	@Override
	public void bark() {
		System.out.println("喵喵...");
	}
}
