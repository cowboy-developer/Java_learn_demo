package com.$520it_03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		//ϣ�����ĸ�ʽ��xxxx��xx��xx�� ����x xxʱxx��xx��
		String pattern = "yyyy-MM-dd HHʱmm��ss��";//�����˲��ĵ�
		DateFormat df = new SimpleDateFormat(pattern);
		
		//��ʽ��
		String str = df.format(new Date());
		System.out.println(str);
		
		//����
		String d = "1997-7-1 00ʱ00��00��";
		Date date = df.parse(d);
		System.out.println(date);
	}

	private static void work() throws Exception {
		//��ȡ����
		//��������ײ㷵����DateFormat���������
//		DateFormat df = DateFormat.getInstance();
		//��ȡ���Ĳ�ͬ����,��Ч������һ����,ֻ�ǳ��������ݸ�ʽ��ͬ����
		DateFormat df = DateFormat.getDateTimeInstance();
		
		//����   ����   ��ʽ��
		//�������ڻ����ܽ���,ӦΪ�Ҳ�֪�����String��ôȥд
		//�ȿ���ʽ�������Ľ��,Ȼ���ٲ���
		String str = df.format(new Date());//����-->�ַ���
		System.out.println(str);
		
		//��ʾ��2015��12��10�� ���� 2����
		//˼·:���ʹ��Date�Ĺ��췽�����Ǳ���Ҫ֪�����ʱ��ĺ���ֵ,�в�ͨ
		//	ͨ������һ���ַ����õ�Date����
		String d = "2015-12-10 14:00:00";
		Date date = df.parse(d);//�ַ���-->����
		System.out.println(date.toLocaleString());
	}
}
