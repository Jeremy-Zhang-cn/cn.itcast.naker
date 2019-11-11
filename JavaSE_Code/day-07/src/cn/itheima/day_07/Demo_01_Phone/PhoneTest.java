package cn.itheima.day_07.Demo_01_Phone;

public class PhoneTest {

	public static void main(String[] args) {

		Phone phone = new Phone();

		phone.setBrand("HUAWEI");
		phone.setPrice(2999);

		System.out.println(phone.getBrand());
		System.out.println(phone.getPrice());

		phone.call();
		phone.sendMessage();

	}
}
