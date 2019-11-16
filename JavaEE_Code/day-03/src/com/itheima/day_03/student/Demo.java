package com.itheima.day_03.student;

public class Demo {

	public static void main(String[] args) {
		Student stu = new Student("张三", 18);
		useStudent(stu);
		System.out.println(stu);
		System.out.println("-------------");
		useStudent(getStudent());
		System.out.println(getStudent());
	}

	public static void useStudent(Student student) {
		student.show();
	}

	public static Student getStudent() {
		return new Student("李四", 19);
	}

}
