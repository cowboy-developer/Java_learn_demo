package com.$520it_03;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		//����һ������
		MyArrayList t = new MyArrayList();

		t.add("haha");
		t.add(10);
		t.add(new Date());
		
		//�������Ԫ��
		t.clear();
		t.add(10);
		System.out.println(t.isEmpty());
		//�鿴���������
		System.out.println(t.size());
		//�鿴���ж�Ա
		System.out.println(t);
	}
}
