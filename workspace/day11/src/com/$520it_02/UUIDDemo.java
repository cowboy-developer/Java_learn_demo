package com.$520it_02;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		/*
		//��ȡUUID����
		UUID u = UUID.randomUUID();
		System.out.println(u);
		//�ٻ�ȡһ��UUID
		u = UUID.randomUUID();
		System.out.println(u);
		//�ٻ�ȡһ��UUID
		u = UUID.randomUUID();
		System.out.println(u);
		*/
		//UUID�ڼ������Ψһ
		//�����ȡ��һ��4λ����Ϊ��֤��
		//ʹ��String��subString����
		UUID u = UUID.randomUUID();
		String str = u.toString();
		//ͨ�������õ��ַ�������
		//��һ��'-'������ Ϊ�˷������+1
		int firIndex = str.indexOf('-') + 1;
		//�ڶ���'-'������
		int secIndex = str.indexOf('-', firIndex);
		str = str.substring(firIndex, secIndex);
		System.out.println(str);
	}
}
