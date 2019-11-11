package cn.itheima.day_07.Student;

class Student {

	private String name;
	private int age;

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

	void study() {
		System.out.println("studying");
	}

	void doHomework() {
		System.out.println("Doing homework");
	}
}
