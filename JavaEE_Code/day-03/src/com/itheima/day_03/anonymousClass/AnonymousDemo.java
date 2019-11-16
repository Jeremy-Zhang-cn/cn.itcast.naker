package com.itheima.day_03.anonymousClass;

public class AnonymousDemo {

	public static void main(String[] args) {

		//有名字的匿名内部类对象
		Inter inter = new Inter() {
			@Override
			public void eat() {
				System.out.println("eating...");
			}
		};

		//使用匿名内部类对象的对象名调用方法
		inter.eat();
		System.out.println("---------");

		//匿名的匿名内部类对象直接调用自己的方法
		new Inter(){
			@Override
			public void eat() {
				System.out.println("eat");
			}
		}.eat();

		useInter(new Inter() {
			@Override
			public void eat() {
				System.out.println("匿名内部类对象作为参数传递");
			}
		});

		useInter(getInter());

	}

	public static void useInter(Inter inter) {
		//匿名内部类对象作为参数传递
		inter.eat();
	}

	public static Inter getInter() {
		//返回值为匿名内部类对象
		return new Inter() {
			@Override
			public void eat() {
				System.out.println("返回值为匿名内部类对象");
			}
		};
	}
}
