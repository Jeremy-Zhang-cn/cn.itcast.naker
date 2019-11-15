package com.itheima.day_01.phone;

class NewPhone extends Phone{

	@Override
	void call(String name) {
		System.out.println("正在发起视频通话");
		super.call(name);
	}
}
