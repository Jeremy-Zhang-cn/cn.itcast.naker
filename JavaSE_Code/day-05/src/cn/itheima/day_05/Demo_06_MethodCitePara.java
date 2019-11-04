package cn.itheima.day_05;

public class Demo_06_MethodCitePara {

	/*
	引用数据类型作为参数传递
		引用数据类型作为参数传递时只传递其在堆内存的地址，然后根据地址值去更改对应元素。
		方法出栈后方法中存储的地址值随之消亡，但是堆内存中的数据已经被改变，且不会随方法的出栈而消亡。
		Tips:String类型虽然属于引用数据类型，但是作为基本类型进行处理。
	 */
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};	//在堆内存中分配空间，存储地址名为arr的数组
		System.out.println("调用change方法前: " + arr[1]);
		System.out.println(arr);
		change(arr);	//将数组的地址名arr作为参数传递给方法，存储在栈内存中
		System.out.println("调用change方法后: " + arr[1]);
		System.out.println(arr);
	}

	public static void change(int[] arr) {
		arr[1] = 200;	//将堆内存中地址名为arr，索引值为1的元素（即20）改为200
	}
}
