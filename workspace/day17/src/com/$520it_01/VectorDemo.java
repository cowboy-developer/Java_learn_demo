package com.$520it_01;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//����һ��Vector����
		List list = new Vector();
		//�����������Ԫ��
		list.add("haha");
		list.add("heihei");
		list.add(Integer.valueOf(123));
		
		System.out.println(list.size());
		System.out.println(list);
		
		//��ѯ
		Object obj = list.get(1);
		System.out.println(obj);
		//�鿴�Ƿ����heihei
		System.out.println(list.contains("hei1hei"));
		
		list.remove(Integer.valueOf(123));
		System.out.println(list.size());
		System.out.println(list);
	}
}
