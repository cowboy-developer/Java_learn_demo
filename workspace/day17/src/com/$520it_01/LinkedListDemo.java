package com.$520it_01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//Ϊʲô����Ҫ�ñ���������-->��Ϊ��Ҫ���õ������еķ���
		LinkedList list = new LinkedList();
		
		//��������ͷ
		list.offerFirst("�޽�˹");
		list.offerFirst("����");
		//��ӵ������ĩβ
		list.offerLast("�ڹѸ�");
		list.offerLast("�̾���");
		
		System.out.println(list);
		
		//�鿴��һ��Ԫ��
		Object obj = list.peekFirst();
		System.out.println(obj);
		//�鿴���һ��Ԫ��
		obj = list.peekLast();
		System.out.println(obj);
		
		//ɾ����һ��Ԫ��
		obj = list.pollFirst();
		System.out.println("������Ԫ����:" + obj);
		System.out.println(list);
		//ɾ�����һ��Ԫ��
		obj = list.pollLast();
		System.out.println("������Ԫ����:" + obj);
		System.out.println(list);

//		list.add("ӥ��");  ����ʹ�õ��ǲ�����
		System.out.println(list);
	}
}
