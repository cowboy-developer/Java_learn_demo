package com.$520it_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//�ײ�ʹ����LinkedHashMap�������洢Ԫ�ص�
		Set<String> set = new LinkedHashSet<>();
		//����
		set.add("Z");
		set.add("a");
		set.add("h");
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}
