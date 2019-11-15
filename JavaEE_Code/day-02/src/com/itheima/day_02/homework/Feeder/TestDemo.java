package com.itheima.day_02.homework.Feeder;

public class TestDemo {

	/*
		分析以下需求，并用代码实现
    (1)动物类:
        a.属性:年龄
        b.行为:喝水,吃东西(吃什么不确定)
    (2)游泳(Swimming)接口:
        a.行为:游泳方法
    (3)狗(Dog)类:
        a.行为:吃饭(啃骨头)和 游泳(狗刨)
    (4)羊(Sheep)类:
        a.行为:吃饭(羊啃草)
    (5)青蛙(Frog)类:
        a.行为:吃饭(吃虫子)和 游泳(蛙泳)
    (6)饲养员类(Feeder):
        a.行为:饲养动物:包括吃饭和喝水
    (7)测试类:
        a.创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
    (8)要求:
        a.子类重写父类中的吃东西方法
        b.要求给狗和青蛙添加游泳的方法(实现游泳接口)
        c.饲养员类中定义一个方法,传入动物类对象(父类),使用instanceof转换成子类,
            调用吃饭方法,如果有游泳方法也需进行测试

    (9)打印如下格式的结果:
        a.狗喝水
        b.狗啃骨头
        c.狗会狗刨游泳

        d.青蛙喝水
        e.青蛙吃小虫
        f.青蛙会蛙泳

        g.羊喝水
        h.羊啃草
	 */
	public static void main(String[] args) {

		Dog dog = new Dog();
		Sheep sheep = new Sheep();
		Frog frog = new Frog();
		Feeder feeder = new Feeder();

		feeder.feed(dog);
		System.out.println();
		feeder.feed(frog);
		System.out.println();
		feeder.feed(sheep);

	}
}
