package com.itheima.day_03.equalsDemo;

public class Student {

	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		//重写toString()方法，使之不会打印出哈希值而是打印出对象的具体内容
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	//重写该类的equals方法
	@Override
	public boolean equals(Object o) {

		//自己与自己比较无意义
		if (this == o) return true;

		//如果o == null:空值，调用方法会出现空指针异常
		//getClass() != o.getClass()比较对象是否来自于同一个类
		// getClass方法获取一个类的字节码对象的class
		if (o == null || getClass() != o.getClass()) return false;

		//多态 向下转型
		Student student = (Student) o;

		if (age != student.age) return false;
		return name != null ? name.equals(student.name) : student.name == null;
	}

}
