package com.$520it_01;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
//		��������
		Random r = new Random();
		/*
		//����0-1�������
		double d = r.nextDouble();
		System.out.println(d);
		//����������������
		int i = r.nextInt();
		System.out.println(i);
		//����һ������0С��100���������
		i = r.nextInt(100);
		System.out.println(i);
		*/
		
		//���һ������,��15%�ĸ��ʲ���450%�ı���
		//˼·:1����һ�������0-100�������
		int ran = r.nextInt(100);
		//2�ж����������Ƿ����15%��Ҫ��
		if (ran < 15) {
			System.out.println("ȡ������,���450%���˺�!");
		} else {
			System.out.println("��Ʒ����!!!");			
		}
		
		//����һ�������[34,87)  
		//˼·:1����һ�����ֵ-��Сֵ�������   [0,53)
		int i = r.nextInt(87 - 34);
		//2�����������Ļ����ϼ���Сֵ  i + 34
		System.out.println(i + 34);
	}
}
