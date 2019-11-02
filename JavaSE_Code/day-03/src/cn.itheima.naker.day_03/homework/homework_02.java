package cn.itheima.naker.day_03.homework;

public class homework_02 {

	/*
	分析以下需求并实现
	public class Test01 {
		public static void main(String[] args) {
			for(int x=1; x<=10; x++) {
				if(x%3==0) {
					//()在此处填写代码
				}
				System.out.println("Java基础班");
			}
		}
	}
	问题:
		1.想在控制台输出2次:"Java基础班"   括号()里面应该填写什么?  break
		2.想在控制台输出7次:"Java基础班"   括号()里面应该填写什么? continue
		3.想在控制台输出13次:"Java基础班"   括号()里面应该填写什么? System.out.println("Java基础班");
	 */
	public static void main(String[] args) {

		for(int x=1; x<=10; x++) {
			if (x % 3 == 0) {
				//()在此处填写代码
			//	break;	//输出两次 遇到3时，跳出循环，只输出2次
			//	continue;	//输出七次 3 6 9 跳过本次循环，少3次输出
				System.out.println("Java基础班");	//输出十三次 3 6 9if内部输出一次，其余情况下if外输出10次
			}
			System.out.println("Java基础班");
		}
	}
}
