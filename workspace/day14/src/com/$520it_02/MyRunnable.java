package com.$520it_02;

//1�Զ���һ����ʵ��Runnable�ӿ�
public class MyRunnable implements Runnable {
	//2��дrun����,���߳�Ҫִ���������Ž�ȥ
	@Override
	public void run() {
		//����߳�ר������
		for (int i = 0; i < 1000; i++) {
			System.out.println("...����...");
		}
	}

}
