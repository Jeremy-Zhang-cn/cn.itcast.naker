package cn.itheima.naker.day_03.extra_work;

public class extra_work_02_LoopWhile {

	/*
		使用while循环打印出1至20之间所有能被3整除的数字;
		要求代码执行的效果如下:
		3
		6
		9
		12
		15
		18
	 */
	public static void main(String[] args) {

		//既然要使用while循环,那么第一步就需要定义一个变量,用于保存循环的起始条件;
		int i = 1;
		//编写while循环,注意控制循环条件
		while (i <= 20) {

			//在循环中判断当前数字是不是3的倍数,如果是则打印出来
			if (i % 3 == 0) {
				System.out.println(i);
			}

			//让变量+1
			i++;
		}
	}
}
