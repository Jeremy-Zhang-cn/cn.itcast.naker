package com.itheima.day_09.homework.test_05;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test_05 {

	/*
		分析以下需求，并用代码实现
			1.定义学生类,包含姓名(String name),性别(String gender),
			年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
			2.键盘录入6个学员信息(录入格式:张三,男,25),
			要求有两个相同的信息,将6个学员信息存入到ArrayList集合中
			3.将存有6个学员信息的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
			4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
			5.对ArrayList集合中的6个学生对象进行去重,
			将去重后的结果利用Writer流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BufferedReader br = new BufferedReader(
				new FileReader("day-09/StudentInfo.txt"));
		PrintWriter pw = new PrintWriter(
				new FileWriter("day-09/StudentInfo_1.txt"),true);

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("day-09/StudentInfo.txt"));
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("day-09/StudentInfo.txt"));

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			System.out.printf("请输入第%d个学员的信息(格式：姓名,性别,年龄):\n", i + 1);
			String userInfo = sc.nextLine();
			String[] split = userInfo.split(",");
			String name = split[0];
			String gender = split[1];
			int age = Integer.parseInt(split[2]);
			Student student = new Student(name, gender, age);
			list.add(student);
		}

		/*
			readObject()方法读至文件尾部是没有默认终止符的，如果直接读取会抛出EOFException异常
			因此采取将对象装入某个容器中，使用readObject()方法读出容器，再遍历容器中的元素的方式读取内容

			如果使用
			Student stu;
			while((stu = readObject()) != null)
			会始终读取同一个序列化对象，读至文件尾会抛出EOFException异常
		*/

		//将对象装入ArrayList容器中，序列化，写入文件中
		oos.writeObject(list);
		oos.flush();

		System.out.println();

		//反序列化读取文件中的对象
		Object o = ois.readObject();
		for (Student student : (ArrayList<Student>) o) {
			System.out.println(student.getName() + " "
					+ student.getGender() + " " + student.getAge());
		}

		//使用Set和List的构造方法进行去重
		LinkedHashSet<Student> students = new LinkedHashSet<>(list);
		list = new ArrayList<>(students);

		//遍历输出
		for (Student student : list) {
			pw.println(student.getName() + "-" +
					student.getGender() + "-" + student.getAge());
		}

		br.close();
		pw.close();
		oos.close();
		ois.close();

	}
}
