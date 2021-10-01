package com.$520it_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//默认没有长度
		List list1 = new ArrayList();
		//list集合的规范是有序可以重复
		//添加元素
		list1.add("王尼玛");
		list1.add("罗杰斯");
		list1.add("罗杰斯");
		list1.add("托尼");
		list1.add("黑寡妇");
		
		list1.set(2, "幻世");
		
		int i = list1.indexOf("黑寡妇");
		System.out.println(i);
		System.out.println(list1);
		
		//把集合转变成数组
		Object[] arr = list1.toArray();
		System.out.println(Arrays.toString(arr));
		
		/*List list2 = new ArrayList();
		//add只存入1个元素
//		list2.add(list1);
//		list2.add("11");
		list2.addAll(list1);
		System.out.println("list2.size=" + list2.size());
		System.out.println(list2);*/
		
	}
}
