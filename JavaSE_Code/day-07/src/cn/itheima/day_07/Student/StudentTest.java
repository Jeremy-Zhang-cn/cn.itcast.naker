package cn.itheima.day_07.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2;

		student1.setName("张三");
		student1.setAge(22);


		System.out.println(student1);
		System.out.println("stu1: " + student1.getName());
		System.out.println("stu1: " +student1.getAge());

		student2 = student1;
		student2.setName("李四");
		student2.setAge(23);

		System.out.println(student2);
		System.out.println("stu1: " + student1.getName());
		System.out.println("stu1: " + student1.getAge());
		System.out.println("stu2: " +student2.getName());
		System.out.println("stu2: " + student2.getAge());

		student1.study();
		student1.doHomework();

	}
}
