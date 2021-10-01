package com.$520it_06;

public class App {
	public static void main(String[] args) {
		/*Person p = new Person();
		//成员变量全部私有不能访问
		p.name = "任真天";
		p.age = 27;
		//成员变量暴露的情况下外部可以随意修改
		p.age = -17;
		p.setAge(10);
		System.out.println("p.age=" + p.getAge());*/
		Zi z = new Zi();
		//这个方法不是静态的基于对象
		//编译时期-->去Zi类中找work方法
		z.work();
		//运行时期-->去执行Zi对象work方法
	}
}
