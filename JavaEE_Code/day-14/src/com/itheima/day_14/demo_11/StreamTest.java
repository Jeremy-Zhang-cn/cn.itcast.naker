package com.itheima.day_14.demo_11;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

	/*
		Stream流的练习：
			现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成以下操作：
				* 男演员只要名字为3个字的前三人
				* 女演员只要姓林的，并且不要第一个
				* 把过滤后的男演员姓名和女演员姓名合并到一起
				* 把上一步操作后的元素作为构造方法的参数创建演员对象，遍历数据

	 */
	public static void main(String[] args) {

		ArrayList<String> maleList = new ArrayList<>();
		maleList.add("周润发");
		maleList.add("成龙");
		maleList.add("刘德华");
		maleList.add("吴京");
		maleList.add("周星驰");
		maleList.add("李连杰");

		ArrayList<String> femaleList = new ArrayList<>();
		femaleList.add("林心如");
		femaleList.add("张曼玉");
		femaleList.add("林青霞");
		femaleList.add("柳岩");
		femaleList.add("林志玲");
		femaleList.add("王祖贤");

	//	Stream<String> maleStream = maleList.stream().filter(s -> s.length() == 3).limit(3);
	//	Stream<String> femaleStream = femaleList.stream().filter(s -> s.startsWith("林")).skip(1);

	//	Stream.concat(maleStream,femaleStream).map(Actor::new).forEach(p -> System.out.println(p.getName()));

		Stream.concat(
				maleList.stream().filter(s -> s.length() == 3).limit(3),
				femaleList.stream().filter(s -> s.startsWith("林")).skip(1)).
				map(Actor::new).
				forEach(p -> System.out.println(p.getName())
				);

	}
}
