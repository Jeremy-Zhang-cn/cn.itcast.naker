package cn.itheima.day_07.homework.animals;

public class Dog extends Animals implements Bark {

	public Dog() {
		super();
	}

	public Dog(String color,String breed) {
		super(color, breed);
	}

	public void eat() {
		System.out.printf("%s色的%s正在啃骨头...\n", this.color, this.breed);
	}

	public void work() {
		System.out.printf("%s色的%s正在看家...\n", this.color, this.breed);
	}

	@Override
	public void bark() {
		System.out.println("汪汪...");
	}
}
