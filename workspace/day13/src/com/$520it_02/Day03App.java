package com.$520it_02;

public class Day03App {
	public static void main(String[] args) {
		//ѭ���ṹ    while  for
		//()����һ��boolean���ʽ,�����ǿ���ѭ��
		int i = 0;
		while (i++ < 10) {
			if (i == 6) {
				System.out.println("����,������");
				break;
			}
			System.out.println("hello" + i);
		}
		
		//ѭ��������ö���һ��,���Ǹ������йص�ѭ�����ǻ�ʹ��for
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
				System.out.println("������,��Ҫ");
				continue;
			}
			System.out.println("hello" + j);
		}
	}

	private static void work1() {
		/*
		//ѡ��ṹ if   if-else   if-else if...else
		//����ǵ�һ���,��������������������ִ�� --> if
		char c = '��';
		if (c == '��') {
			System.out.println("����·");
		}
		
		//��ѡһ
		if (false) {
			//true -> ִ��
			System.out.println("ҪǮ");
		} else {
			//false -> ִ��
			System.out.println("Ҫ��");
		}
		
		
		//�ڶ��������ѡ��
		int day = 4;
		if (day == 1) {
			System.out.println("������");
		} else if (day == 2) {
			System.out.println("������");
		} else if (day == 3) {
			System.out.println("�в�Ʊ");
		} else {
			System.out.println("�Ʋ�");
		}
		
		
		//��ʵswitch����ڶ��ص�ifelse
		int day = 1;
		//ֻ֧��int/short/char/byte�������ǵİ�װ��
		switch (Integer.valueOf(1).intValue()) {
			//��������ص��һֱִ��ֱ������break����ִ�����
			//ƥ��ֻ��1������,ƥ��һ�κ�����caseʧЧ
			case 1:
				System.out.println("������");
				
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("�в�Ʊ");
				break;
			default:
				System.out.println("�Ʋ�");
		}
		*/
		String s = "a";
		switch (s) {
			case "a":
				System.out.println('a');
				break;
		}
	}
}
