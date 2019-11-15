package com.itheima.day_02.homework.animal;

public class TestDemo {

	/*
		根据需求完成代码:
    (1)定义一个动物类
        a.行为:eat方法(无具体行为,不同动物吃的不一样)

    (2)定义一个狗类继承动物类
        a.行为:eat方法(啃骨头),看家方法

    (3)定义一个猫类继承动物类
        a.行为:eat方法(吃鱼),抓老鼠方法

    (4)测试类:
        a.定义一个方法,要求该方法既能接收狗对象也能接收猫对象  抽象类作为方法的参数 作为方法的返回值
          在该方法的内部调用eat()方法,并且调用狗和猫的特有方法
	 */
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		AnimalOperate(cat);
		System.out.println("--------");
		AnimalOperate(dog);
	}

	private static void AnimalOperate(Animal animal) {

		animal.eat();
		if (animal instanceof Dog) {
			((Dog) animal).homeWatch();
		} else {
			((Cat) animal).catchMouse();
		}
	}
}
