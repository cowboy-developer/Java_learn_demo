package com.$520it_04;

import com.$520it_03.MyArrayList;

public class MyStack extends MyArrayList {
//	ѹջ��push
	public void push(Object ele) {
		//���Ԫ����ĩβ
		add(ele);
	}
	
//	��ջ��pop
	public Object pop() {
		Object obj = peek();
		//ɾ��ĩβ��Ԫ��
		remove(size() - 1);
		return obj;
	}
	
//	�鿴��peek
	public Object peek() {
		//����ĩβ��Ԫ��
		return get(size() - 1);
	}
}
