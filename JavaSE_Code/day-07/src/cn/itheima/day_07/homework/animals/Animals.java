package cn.itheima.day_07.homework.animals;

public abstract class Animals {

	String color;
	String breed;

	public Animals() {
	}

	public Animals(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	void setBreed(String breed) {
		this.breed = breed;
	}

	public abstract void eat();
	public abstract void work();

}
