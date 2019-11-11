package cn.itheima.ExamDemo.Test_01;

import java.util.ArrayList;

public class MovieTest {

	/*
		1. 设计一个Movie类，私有成员变量：title,director,type,并生成对应的set/get方法
		2.定义测试类，在Main方法中完成以下要求：
			2.1 创建三个Movie对象，分别为“唐山大地震”，“冯小刚”，“灾难”，“羞羞的铁拳”，
			“宋阳”，“喜剧”，“集结号”，“冯小刚”，“历史”；
			2.2 将以上三个对象添加到list集合中
			2.3 遍历集合，将导演为“冯小刚”的电影按照指定格式输出打印到控制台中
	 */
	public static void main(String[] args) {

		Movie movie1 = new Movie("唐山大地震","冯小刚","灾难");
		Movie movie2 = new Movie("羞羞的铁拳","宋阳","喜剧");
		Movie movie3 = new Movie("集结号","冯小刚","历史");

		ArrayList<Movie> list = new ArrayList<>();
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);

		for (Movie movie : list) {
			if ("冯小刚".equals(movie.getDirector())) {
				System.out.println(movie.getTitle() + "-" + movie.getDirector() + "-" + movie.getType());
			}
		}
	}
}
