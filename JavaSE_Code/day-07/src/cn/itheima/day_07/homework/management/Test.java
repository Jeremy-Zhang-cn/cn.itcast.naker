package cn.itheima.day_07.homework.management;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager("经理", 123, 15000, 6000);

		Coder coder = new Coder();

		coder.setName("程序猿");
		coder.setId(135);
		coder.setSalary(10000);

		manager.work();
		System.out.println("---------------");
		coder.work();

	}
}
