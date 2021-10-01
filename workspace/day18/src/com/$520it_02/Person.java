package com.$520it_02;

//如果自定义对象要存入红黑树中,实现Comparable接口
public class Person implements Comparable<Person> {
	@Override
	public int compareTo(Person o) {
		//查看比较的过程
		System.out.println(name + "-->" + o.name);
		/*
		         返回值有3个含义
		         正数   大于对象
		         零       等于对象
		         负数   小于对象
		 */
		//比较规则,按照年龄来比
		return age - o.age;
	}

	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
