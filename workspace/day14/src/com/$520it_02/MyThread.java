package com.$520it_02;
/*
 1���Զ�����̳���Thread�࣬��ô���Զ���������߳��ࣻ
 2����дrun���������߳����еĴ�������run�У�
 3�������Զ�����Ķ��󣬼��̶߳���
 4�������̶߳����start�����������̡߳�
 */
public class MyThread extends Thread {
	//��дrun����,��д��Ҳһ���������쳣
	@Override
	public void run() {
		//����߳�ר������
		for (int i = 0; i < 1000; i++) {
			System.out.println("...����...");
		}
	}
}
