package com.$520it_04;

public class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("123");
		stack.push("456");
		
		//����ջ����Ԫ��
		System.out.println(stack.peek());
		//ɾ��ջ����Ԫ��
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
