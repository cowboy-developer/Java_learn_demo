package com.$520it_03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//1:��ȡ����
		Calendar c = Calendar.getInstance();
		/*work(c);
		
		//3���õ�ǰ������
		c.set(Calendar.YEAR, 2010);
		work(c);
		
		//��ȡ��ǰ������Date��ʽ
		Date date = c.getTime();
		System.out.println(date);
		//��Date����������
		c.setTime(new Date());
		work(c);*/
		
		//���� 140�����ʲô����
		c.add(Calendar.DAY_OF_MONTH, 140);
		work(c);
		//�ص�3000��ǰ
		c.add(Calendar.YEAR, -3000);
		work(c);
	}

	private static void work(Calendar c) {
		//��ȡ�������ֶε�ֵ
		int year = c.get(Calendar.YEAR);
		//��ȡ��   �����1����ʹ��0����ʾ
		int month = c.get(Calendar.MONTH) + 1;
		//��ȡ��
		int day = c.get(Calendar.DAY_OF_MONTH);
		//��ȡСʱ
		int hour = c.get(Calendar.HOUR_OF_DAY);
		//��ȡ����
		int minute = c.get(Calendar.MINUTE);
		//��ȡ��
		int second = c.get(Calendar.SECOND);
		String info = String.format("%d��%d��%d��--%dʱ%d��%d��", 
				year, month, day, hour, minute, second);
		System.out.println(info);
	}
}
