package cn.itheima.day_09.studentManagement;

class Student {

	private String stuId;
	private String name;
	private int age;
	private String address;

	Student() {
	}

	Student(String stuId, String name, int age, String address) {
		this.stuId = stuId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	String getStuId() {
		return stuId;
	}

	void setStuId(String stuId) {
		this.stuId = stuId;
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

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

}
