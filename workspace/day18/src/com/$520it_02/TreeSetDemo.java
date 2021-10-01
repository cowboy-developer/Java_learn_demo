package com.$520it_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Comparator<User> com = new Comparator<User> () {
			@Override
			public int compare(User o1, User o2) {
				//�Ӵ�С
				return o2.getAge() - o1.getAge();
			}
		};
		
		//��������ִ��ʹ�ñȽ���
		Set<User> set = new TreeSet<>(com);
		//ͨ���鿴Դ����,�Զ���ıȽ�������������
		
		User p = new User("����", 30);
		User p1 = new User("�ڹѸ�", 30);
		User p2 = new User("�޽�˹", 130);
		User p3 = new User("����", 35);
		User p4 = new User("����", 45);
		User p5 = new User("�̾���", 28);
		User p6 = new User("֩����", 27);
		
		//����Ԫ�ص�ʹ�ñ���:����ת���쳣
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		System.out.println(set);
		
		/*Set<Integer> set = new TreeSet<>();
		//�����ʹ�õ��Ƕ������Ȼ˳��.  С->��
		set.add(10);
		set.add(5);
		set.add(7);
		System.out.println(set);
		
		Person p1 = new Person("�ڹѸ�", 30);
		Person p2 = new Person("�޽�˹", 130);
		Person p3 = new Person("����", 35);
		Person p4 = new Person("����", 45);
		Person p5 = new Person("�̾���", 28);
		Person p6 = new Person("֩����", 27);
		*/
		
	}
}
