package com.$520it_06;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//������ʱ��
		Timer timer = new Timer();
		
		//��������
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("����ִ����");
			}
		};
		//����1:ִ������  ����2:��һ��ִ�е�ʱ��
//		timer.schedule(task, new Date());
		//����3:ѭ��ִ�еļ��ʱ��(����)
		timer.schedule(task, new Date(), 1000);
		
//		timer.scheduleAtFixedRate(task, new Date(), 1000);
		//�رն�ʱ��,һ�㶼����
		timer.cancel();
	}
}
