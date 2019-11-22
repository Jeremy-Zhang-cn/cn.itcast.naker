package com.itheima.day_03.homework.demo_02;

public class Test {

	/*
	分析以下需求，并用代码实现
	要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现
	public class Test {
		public static void main(String[] args) {
		}
	}
	//定义接口
	interface InterA {
		void showA();
	}
	class A {
		public void methodA(InterA a) {
			a.showA();
		}
	}
	 */
	public static void main(String[] args) {

		//匿名的匿名内部类对象形式
		new A().methodA(new InterA() {
			@Override
			public void showA() {
				System.out.println("show A, First");
			}
		});

		//有名字的匿名内部类对象形式
		A entityA = new A();
		InterA a = new InterA(){
			@Override
			public void showA() {
				System.out.println("show A, Second");
			}
		};

		entityA.methodA(a);
	}
}
