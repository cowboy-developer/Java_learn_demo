package com.$520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�޽�˹");
		list.add("����");
		list.add(111);
		list.add("�ͻ�");
		list.add("ӥ��");
		list.add("�̾���");
		list.add(new Date());
//		System.out.println(list);
		work3(list);
	}
	
	private static void work3(List list) {
		//ʹ��List���еĵ�����
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//�������next�ƶ�λ�ú����ʹ��
			it.set("����");
		}
		it.add("�ϻ���");
		System.out.println(list);
		System.out.println("----------------");
		while (it.hasPrevious()) {//�ж��Ƿ�����һ��Ԫ��
			//ȡ����һ��
			System.out.println(it.previous());
		}
	}

	private static void work2(List list) {
		//ʹ���������ķ�ʽ����List-->������
		//1:��ȡ������
		Iterator it = list.iterator();
		//ȡ��Ԫ��ǰ,Ӧ�����ж��Ƿ���Ԫ��
		while (it.hasNext()) {
			//�����ȡ��Ԫ��
			//ȡ����һ����Ԫ��
			System.out.println(it.next());
			//ConcurrentModificationException
			//ʹ�õ����������Ĺ����в��ܶ�ԭ�����е�Ԫ���޸�
//			list.remove(0);
			//ʹ��ɾ������Ҫ�Ȼ�ȡ,����ɾ��
//			it.remove();
		}
		System.out.println(list);
	}
	
	private static void work1(List list) {
		//ʹ��ѭ������
		//1:�Ѽ���ת�������
//		Object[] arr = list.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//˼��:-->���������õ�����ĸ�����,�����ܻ�ȡ������Ӧ��Ԫ����
		//ת�������ĳ����൱�ڼ���Ԫ�صĸ���,ʹ��get(index);
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
