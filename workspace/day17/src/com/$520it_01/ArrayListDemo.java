package com.$520it_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Ĭ��û�г���
		List list1 = new ArrayList();
		//list���ϵĹ淶����������ظ�
		//���Ԫ��
		list1.add("������");
		list1.add("�޽�˹");
		list1.add("�޽�˹");
		list1.add("����");
		list1.add("�ڹѸ�");
		
		list1.set(2, "����");
		
		int i = list1.indexOf("�ڹѸ�");
		System.out.println(i);
		System.out.println(list1);
		
		//�Ѽ���ת�������
		Object[] arr = list1.toArray();
		System.out.println(Arrays.toString(arr));
		
		/*List list2 = new ArrayList();
		//addֻ����1��Ԫ��
//		list2.add(list1);
//		list2.add("11");
		list2.addAll(list1);
		System.out.println("list2.size=" + list2.size());
		System.out.println(list2);*/
		
	}
}
