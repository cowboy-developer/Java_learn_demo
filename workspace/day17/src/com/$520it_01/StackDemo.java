package com.$520it_01;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		//�����һ��ջ
//		ѹջ
		s.push("������");
		s.push("�̾���");
		s.push("����");
		s.push("֩����");
//		��ջ   ɾ��ջ����Ԫ��
		s.pop();
//		�鿴ջ����Ԫ��
		System.out.println(s.peek());
		//��ʹ��ջ���ݽṹʱ,������Ҫȥ����List�淶����
		System.out.println(s.get(1));
	}
}
