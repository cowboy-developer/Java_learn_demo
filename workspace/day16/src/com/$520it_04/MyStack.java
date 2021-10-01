package com.$520it_04;

import com.$520it_03.MyArrayList;

public class MyStack extends MyArrayList {
//	压栈：push
	public void push(Object ele) {
		//添加元素在末尾
		add(ele);
	}
	
//	弹栈：pop
	public Object pop() {
		Object obj = peek();
		//删除末尾的元素
		remove(size() - 1);
		return obj;
	}
	
//	查看：peek
	public Object peek() {
		//访问末尾的元素
		return get(size() - 1);
	}
}
