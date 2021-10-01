package com.$520it_01;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		//创建对象
		Set<User> set = new HashSet<>();
		User u1 = new User("黑寡妇", 30);
		User u3 = new User("黑寡妇", 30);
		User u2 = new User("罗杰斯", 130);
		
		set.add(u1);
		set.add(u2);
		set.add(u3);
		System.out.println(set);
		
		/*
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(100);
		set.add(100);
		set.add(100);
		System.out.println(set);
		
		Set<String> set = new HashSet<>();
	 	//添加元素
		set.add("C");
		set.add("B");
		//方法的返回值表示对象是否添加成功
		System.out.println(set.add("A"));
		//不能存储重复元素
		System.out.println(set.add("B"));
		//元素的顺序完全取决于对象的哈希码
		//这个集合是不会记录元素的添加顺序
		System.out.println(set);
		 */
	}
}
