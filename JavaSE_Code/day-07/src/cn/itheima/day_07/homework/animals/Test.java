package cn.itheima.day_07.homework.animals;

public class Test {

	public static void main(String[] args) {

		Cat cat = new Cat("蓝","英国短毛");
		Dog dog = new Dog();

		dog.setColor("白");
		dog.setBreed("博美犬");

		cat.eat();
		cat.work();
		cat.bark();
		System.out.println("------------");
		dog.eat();
		dog.work();
		dog.bark();
	}
}
