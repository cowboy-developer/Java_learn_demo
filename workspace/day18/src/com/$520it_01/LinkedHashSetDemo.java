package com.$520it_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//底层使用了LinkedHashMap对象来存储元素的
		Set<String> set = new LinkedHashSet<>();
		//有序
		set.add("Z");
		set.add("a");
		set.add("h");
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}
