package com.$520it_02;

public class App {
	public static void main(String[] args) {
		//����һ������
		Team t = new Team();
		//����ֻ��5������
		//���������Ա
		t.add(10);
		t.add(20);
		t.add(20);
		t.add(20);
		t.add(20);
		t.add(10);

		/*
		//��ѯ0��λ���ϵĶ�Ա
		System.out.println(t.get(10));
		//�ҳ�20����������λ��
		int i = t.indexOf(20);
		System.out.println("20-->" + i);
		//10��Ա������,�滻��1
		t.set(0, 1);
		 */
		//20��Ӣ�¾�����
		t.remove(0);
		//�鿴���������
		System.out.println(t.size());
		//�鿴���ж�Ա
		System.out.println(t);
	}
}
