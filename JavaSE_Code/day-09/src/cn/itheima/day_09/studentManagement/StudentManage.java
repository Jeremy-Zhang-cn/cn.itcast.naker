package cn.itheima.day_09.studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

	/*
		学生信息管理系统
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		while (true) {

			System.out.println("----------欢迎使用学生管理系统 v1.0----------");
			System.out.println("1. 添加学生信息");
			System.out.println("2. 删除学生信息");
			System.out.println("3. 修改学生信息");
			System.out.println("4. 查看所有学生信息");
			System.out.println("5. 退出系统");
			System.out.println("请输入你的选择：");

			Scanner sc = new Scanner(System.in);
			int choice;

			choice = sc.nextInt();

			switch (choice) {

				case 1:
					addStudent(list);
					System.out.println();
					break;

				case 2:
					deleteStudent(list);
					System.out.println();
					break;

				case 3:
					updateStudent(list);
					System.out.println();
					break;

				case 4:
					checkAllStudent(list);
					System.out.println();
					break;

				case 5:
					System.out.println("感谢您的使用。");
					return;		//当选择case5时，结束当前正在执行的方法（main())。
								// 也可以在while外定义一个布尔类型的变量作为while的判断条件，
								// 当选择case5时，将这个布尔值改为false

				default:
					System.out.println("输入有误，请输入正确的数字（1~5）:");
					System.out.println();
					break;
			}
		}

	}

	//返回值类型为void, 参数类型为ArrayList<Student>, 向集合中添加对象
	private static void addStudent(ArrayList<Student> list) {

		Student stu = new Student();
		String stuId;
		while (true) {
			System.out.println("请输入学号：");
			stuId = sc.next();

			if (isUsed(list, stuId)){	//判断学号是否被占用
				System.out.println("学号已被占用，请重新输入");
			} else {
				stu.setStuId(stuId);
				System.out.println("请输入姓名：");
				stu.setName(sc.next());
				System.out.println("请输入年龄：");
				stu.setAge(sc.nextInt());
				System.out.println("请输入家庭住址：");
				stu.setAddress(sc.next());

				list.add(stu);
				System.out.println("添加学生信息成功");
				return;		//结束当前方法(addStudent())
			}
		}

	}

	//返回值类型为void,参数类型为ArrayList<Student>,从集合中删除对象
	private static void deleteStudent(ArrayList<Student> list) {

		String stuId;
		System.out.println("请输入您要删除的学生的学号：");
		stuId = sc.next();

		for (int i = list.size() - 1; i >= 0; i--) {
			if (stuId.equals(list.get(i).getStuId())) {
				list.remove(i);
				System.out.println("删除学生信息成功");
				return;		//中止当前方法(deleteStudent())
			}
		}
		System.out.println("学号信息有误，删除失败");
	}

	//返回值类型为void, 参数类型为ArrayList<Student>, 修改集合中对象的属性
	private static void updateStudent(ArrayList<Student> list) {

		String stuId, name, address;
		int age;
		System.out.println("请输入您要修改信息的学生学号：");
		stuId = sc.next();

		for (int i = list.size() - 1; i >= 0; i--) {

			if (stuId.equals(list.get(i).getStuId())) {

				System.out.println("输入新姓名：");
				name = sc.next();
				System.out.println("输入新年龄：");
				age = sc.nextInt();
				System.out.println("输入新家庭住址：");
				address = sc.next();

				Student stu = new Student(stuId, name, age, address);
				list.set(i, stu);
				System.out.println("修改学生信息成功");
				return;		//中止当前方法（updateStudent())
			}
		}
		System.out.println("该学号不存在，请输入正确的学号");

	}

	//返回值类型为void, 参数类型为ArrayList<Student>, 查看集合中所有对象属性
	private static void checkAllStudent(ArrayList<Student> list) {

		if (list.size() == 0) {
			System.out.println("无信息，请先添加学生信息再查询");
			return;	//中止当前方法（checkAllStudent())
		}

		System.out.println("学号\t\t姓名\t\t年龄\t\t家庭住址");
		for (Student student : list) {
			System.out.println(student.getStuId() + "\t" + student.getName() + "\t\t"
					+ student.getAge() + "岁\t\t " + student.getAddress());
		}

	}

	//返回值类型为boolean, 参数类型为String和ArrayList<Student> 查看学号是否被占用
	private static boolean isUsed(ArrayList<Student> list, String stuId) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (stuId.equals(list.get(i).getStuId())) {
				flag = true;
			}
		}
		return flag;
	}

}
