package com.$520it_01;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		//这个是一个栈
//		压栈
		s.push("钢铁侠");
		s.push("绿巨人");
		s.push("蚁人");
		s.push("蜘蛛侠");
//		弹栈   删除栈顶的元素
		s.pop();
//		查看栈顶的元素
		System.out.println(s.peek());
		//在使用栈数据结构时,尽量不要去调用List规范方法
		System.out.println(s.get(1));
	}
}
