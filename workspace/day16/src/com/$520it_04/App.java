package com.$520it_04;

public class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("123");
		stack.push("456");
		
		//访问栈顶的元素
		System.out.println(stack.peek());
		//删除栈顶的元素
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
