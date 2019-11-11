package cn.itheima.ExamDemo.Test_03;

import java.util.ArrayList;

public class Test {

	/*
		1.定义"歌⼿"类,Singer,包含以下成员:
		 1.1成员属性: name (姓名):String类型，age (年龄):int类型，
		 like (爱好):String类型，属性使⽤private修饰。
		 1.2⽣成⽅法： 1).get/set⽅法 2)有参构造⽅法

		2.定义类：Test,类中定义main()⽅法，按以下要求编写代码:
		 2.1分别实例化四个Singer对象，四个对象的属性分别为："刘德华" ,25,”打篮球”、
		 "张学友" ,35,”游泳”、"郭富城" ,19,”踢⾜球”、"黎明" ,18,”击剑”;
		 2.2创建⼀个ArrayList集合，这个集合⾥⾯存储的是Singer类型，
		 分别将上⾯的四个Singer对象添加到集合中 ；
		 2.3遍历这个集合，在遍历的过程中，如果集合中对象的年龄⼤于30，
		 那么将这个对象的爱好改成”打保龄球”，如果对象的年龄⼩于20，那么就把这个对象删除。
		 2.4正确修改和删除对象后，遍历集合，打印集合⾥所有对象的所有属性信息到控制台。
	 */
	public static void main(String[] args) {

		Singer singer1 = new Singer("刘德华", 25, "打篮球");
		Singer singer2 = new Singer("张学友", 35, "游泳");
		Singer singer3 = new Singer("郭富城", 19, "踢足球");
		Singer singer4 = new Singer("黎明", 18, "击剑");

		ArrayList<Singer> list = new ArrayList<>();
		list.add(singer1);
		list.add(singer2);
		list.add(singer3);
		list.add(singer4);

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).getAge() > 30) {
				list.get(i).setLike("打保龄球");
			} else if (list.get(i).getAge() < 20) {
				list.remove(i);
			}
		}

		for (Singer singer : list) {
			System.out.println(singer.getName() + "  " +
					singer.getAge() + "  " + singer.getLike());
		}
	}
}
