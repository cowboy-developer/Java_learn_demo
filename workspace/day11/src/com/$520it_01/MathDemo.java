package com.$520it_01;

public class MathDemo {
	public static void main(String[] args) {
		//��ʾ����ֵ      �����������������ʽ
		System.out.println(Math.abs(-10));
		//������    �����η�
		System.out.println(Math.cbrt(-8));
		//��������С��+1,��������С��
		System.out.println(Math.ceil(-1.9));
		//��������С��,��������С����-1
		System.out.println(Math.floor(1.9));
		//�����������е����ֵ
		System.out.println(Math.max(100, 100.1));
		//�����������е���Сֵ
		System.out.println(Math.min(100, 100.1));
		//��һ�������ĵڶ��������η�
		System.out.println(Math.pow(10,2));
		//��������
		System.out.println(Math.round(10.4));
		//��ƽ��,ֻ���������ܿ�ƽ
		System.out.println(Math.sqrt(9));
		
		//����һ���������[0.0,1.0)
		System.out.println(Math.random());
		//����һ��0-100�������
		System.out.println((int) Math.random() * 100);
	}
}
