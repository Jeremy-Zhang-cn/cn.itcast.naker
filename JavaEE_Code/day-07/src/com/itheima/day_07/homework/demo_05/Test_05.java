package com.itheima.day_07.homework.demo_05;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test_05 {

	/*
		创建一个Student类(name,age), 定义一个String数组
		str[]={"橙汁","雪碧","啤酒","二锅头","可乐","红茶"}用来代表喝的饮料,
		键盘录入三个学生的信息,格式为:姓名,年龄 ,
		通过Student类的有参构造将其封装成学生对象,然后将这3个对象存入到Map集合中
		( map<学生，要喝的饮料>)，其中key是Student对象,对应的value值需要随机
		（random）从str数组中获取，
		要求:
		如果Student对象的年龄不满18岁则不能喝酒,如果获取到白酒或者啤酒则必须继续获取,
		直到获取到其它饮料为止
	 */
	public static void main(String[] args) {


		HashMap<Student, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		//录入学生信息
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的信息（格式：姓名，年龄）：");
			String stuInfo = sc.nextLine();

			String[] split = stuInfo.split("，");

			String name = split[0];
			int age = Integer.parseInt(split[1]);

			Student student = new Student(name, age);
			map.put(student, getDrink(student));

		}

		Set<Student> students = map.keySet();
		for (Student student : students) {
			System.out.println(student.getName() + " ," + student.getAge() + " ," + map.get(student));
		}

	}

	private static String getDrink(Student student) {

		String[] str = {"橙汁", "雪碧", "啤酒", "二锅头", "可乐", "红茶"};
		Random rd = new Random();
		String value = str[rd.nextInt(str.length)];

		//根据年龄判断饮品是否符合要求
		while (student.getAge() < 18 && ("二锅头".equals(value) || "啤酒".equals(value))) {
			value = str[rd.nextInt(str.length)];
		}
		return value;
	}

}
