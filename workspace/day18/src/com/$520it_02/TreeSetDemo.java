package com.$520it_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Comparator<User> com = new Comparator<User> () {
			@Override
			public int compare(User o1, User o2) {
				//从大到小
				return o2.getAge() - o1.getAge();
			}
		};
		
		//创建对象执行使用比较器
		Set<User> set = new TreeSet<>(com);
		//通过查看源代码,自定义的比较器有先起作用
		
		User p = new User("雷神", 30);
		User p1 = new User("黑寡妇", 30);
		User p2 = new User("罗杰斯", 130);
		User p3 = new User("托尼", 35);
		User p4 = new User("鸟人", 45);
		User p5 = new User("绿巨人", 28);
		User p6 = new User("蜘蛛侠", 27);
		
		//存入元素的使用报错:类型转换异常
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		System.out.println(set);
		
		/*Set<Integer> set = new TreeSet<>();
		//红黑树使用的是对象的自然顺序.  小->大
		set.add(10);
		set.add(5);
		set.add(7);
		System.out.println(set);
		
		Person p1 = new Person("黑寡妇", 30);
		Person p2 = new Person("罗杰斯", 130);
		Person p3 = new Person("托尼", 35);
		Person p4 = new Person("鸟人", 45);
		Person p5 = new Person("绿巨人", 28);
		Person p6 = new Person("蜘蛛侠", 27);
		*/
		
	}
}
