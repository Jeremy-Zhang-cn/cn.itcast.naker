package com.itheima.day_06.Demo_01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int ageDiff = s1.getAge() - s2.getAge();

				int nameDiff = ageDiff == 0 ? s1.getName().compareTo(s2.getName()) : ageDiff;

				return nameDiff;
			}
		});

		set.add(new Student("张三", 20));
		set.add(new Student("李四", 20));
		set.add(new Student("王五", 19));
		set.add(new Student("赵六", 21));

		for (Student student : set) {
			System.out.println(student);
		}
	}
}
