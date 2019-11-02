package cn.itheima.naker.day_03.extra_work;

public class extra_work_01_correspond {

	/*
		题目1（加强训练）

		修改下列代码中的4处错误,使程序能正常运行,且在控制台输出:

		 Java是世界第一编程语言!

		public class Demo01 {
			public static void main(String[] args) {
				int choose = "1";	//定义的为Int类型变量，不能赋字符型变量为值
				switch (choose) {
					case "1":	//应该使用int
						System.out.println("Java是世界第一编程语言!");
					case "2":	//应该使用int
						System.out.println("PHP是世界第一编程语言!");
					case "3":	//应该使用int
						System.out.println("C++是世界第一编程语言!");
					default:
						System.out.println("大家都是世界第一编程语言!");
				}
			}
		}
	 */

	public static void main(String[] args) {
		int choose = 1;
		switch (choose) {
			case 1:
				System.out.println("Java是世界第一编程语言!");
			case 2:
				System.out.println("PHP是世界第一编程语言!");
			case 3:
				System.out.println("C++是世界第一编程语言!");
			default:
				System.out.println("大家都是世界第一编程语言!");
		}
	}
}
