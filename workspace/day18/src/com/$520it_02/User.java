package com.$520it_02;

public class User {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
