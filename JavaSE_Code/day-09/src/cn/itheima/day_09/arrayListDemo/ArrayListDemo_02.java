package cn.itheima.day_09.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo_02 {

	/*
		public ArrayList(): //空参构造方法， 构造一个初始容量为10的空列表

	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		//public boolean add(E, e):将指定的元素追加到此集合的末尾
		list.add("Jeremy");
		list.add("naker");
		list.add("张三");

		//public void add(int index, E element): 在此集合的指定位置插入指定的元素
		list.add(1, "web");
		list.add(3, "java");

		//public boolean remove(Object o): 删除指定的元素，返回删除是否成功
		System.out.println(list.remove("web"));

		//public E remove(int index): 删除指定索引处的元素， 返回被删除元素
		System.out.println(list.remove(2));

		//public E set(int index,E element): 修改指定索引处的元素，返回被修改的元素
		System.out.println(list.set(2,"李四"));

		//public E get(int index): 返回指定索引处的元素
		System.out.println(list.get(1));

		//public int size(): 返回集合中的元素个数

		System.out.println(list.size());

		//输出集合
		System.out.println("list:" + list);
	}
}
