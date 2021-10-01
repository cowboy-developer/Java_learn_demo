package com.$520it_01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//为什么这里要用本类型声明-->因为我要调用的是特有的方法
		LinkedList list = new LinkedList();
		
		//添加链表的头
		list.offerFirst("罗杰斯");
		list.offerFirst("鸟人");
		//添加到链表的末尾
		list.offerLast("黑寡妇");
		list.offerLast("绿巨人");
		
		System.out.println(list);
		
		//查看第一个元素
		Object obj = list.peekFirst();
		System.out.println(obj);
		//查看最后一个元素
		obj = list.peekLast();
		System.out.println(obj);
		
		//删除第一个元素
		obj = list.pollFirst();
		System.out.println("弹出的元素是:" + obj);
		System.out.println(list);
		//删除最后一个元素
		obj = list.pollLast();
		System.out.println("弹出的元素是:" + obj);
		System.out.println(list);

//		list.add("鹰眼");  可以使用但是不建议
		System.out.println(list);
	}
}
