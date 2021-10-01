package com.$520it_02;

import java.io.Serializable;

public class User implements Serializable {

	//这个序列化ID是对象的唯一标准,主要是用于反序列化
	//如果没有显示声明我只要在类中修改任何一点内容ID号都会改变,影响反序列化
	private static final long serialVersionUID = -8110365989779347086L;
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
