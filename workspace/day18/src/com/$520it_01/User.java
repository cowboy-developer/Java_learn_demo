package com.$520it_01;

public class User {
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		//存储哈希码时会先获取对象的哈希码
		//哈希码相同再调用equals方法判断
		//循环后哈希码都不相同当成新元素存入
		int code = 31 * 10;
		System.out.println(code);
		return code;
	}
	
	@Override
	public boolean equals(Object obj) {
		//如果姓名和年龄都一致,认为是同一个对象
		//在哈希相同使用会调用equals,返回true,说明元素重复了
		//循环后equals都返回false,说明元素不重复,存入
		User u = (User) obj;
		return name.equals(u.name) && age == u.age;
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
	
	public User() {
		super();
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
