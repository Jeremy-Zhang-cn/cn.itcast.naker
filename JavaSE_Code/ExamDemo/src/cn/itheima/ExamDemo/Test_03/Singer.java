package cn.itheima.ExamDemo.Test_03;

public class Singer {

	private String name;
	private int age;
	private String like;

	public Singer() {
	}

	Singer(String name, int age, String like) {
		this.name = name;
		this.age = age;
		this.like = like;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getLike() {
		return like;
	}

	void setLike(String like) {
		this.like = like;
	}
}
