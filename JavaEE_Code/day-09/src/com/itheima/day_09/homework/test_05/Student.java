package com.itheima.day_09.homework.test_05;

import java.io.Serializable;

public class Student implements Serializable {

	//实现Serializable接口，以达到序列化的目的
	private static final long serialVersionUID = 7565713248760945988L;
	private String name;
	private String gender;
	private int age;

	public Student() {
	}

	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (age != student.age) return false;
		if (name != null ? !name.equals(student.name) : student.name != null) return false;
		return gender != null ? gender.equals(student.gender) : student.gender == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + age;
		return result;
	}
}
