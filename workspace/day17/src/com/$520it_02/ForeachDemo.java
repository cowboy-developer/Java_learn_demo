package com.$520it_02;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�޽�˹");
		list.add("����");
		list.add(111);
		list.add("�ͻ�");
		
		//ʹ��foreach���е���
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
