package com.$520it_03;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//��������   Date�����ʾ����ʱ��ĺ���ֵ
		//�޲ι����ʾ���ǵ�ǰʱ��
		Date d = new Date();
		System.out.println(d);
		//��ʾ������Ԫ
//		d = new Date(0);
		d = new Date(System.currentTimeMillis());
		System.out.println(d);
		//�������������Ҫ�����ǵ����˹�ʱ�ķ���,���߾�������
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
	}
}
