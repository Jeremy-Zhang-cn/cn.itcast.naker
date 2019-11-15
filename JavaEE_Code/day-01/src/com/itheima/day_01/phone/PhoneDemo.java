package com.itheima.day_01.phone;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p = new Phone();
		p.call("张三");
		System.out.println("---------");
		NewPhone np = new NewPhone();
		np.call("李四");

	}

}
