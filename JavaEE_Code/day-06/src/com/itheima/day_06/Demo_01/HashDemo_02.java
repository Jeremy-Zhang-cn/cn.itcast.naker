package com.itheima.day_06.Demo_01;

import com.itheima.day_06.Demo_01.Student;

import java.util.LinkedHashSet;

public class HashDemo_02 {

	public static void main(String[] args) {

//		HashSet<Student> set = new HashSet<>();	//无序的
		LinkedHashSet<Student> set = new LinkedHashSet<>();	//有序的
		set.add(new Student("张三", 18));
		set.add(new Student("张三", 18));
		set.add(new Student("李四", 18));
		set.add(new Student("王五", 18));

		for (Student student : set) {
			System.out.println(student);
		}

	}
}
