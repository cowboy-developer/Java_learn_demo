package com.$520it_06;

public class Person {
	private String name;
	private int age;
	//提供外界访问的途径
//	设置途径 setter
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	获取途径 getter
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
}
