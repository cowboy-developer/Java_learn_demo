package com.$520it_02;

public class App {
	public static void main(String[] args) {
		//����
		//����һ��������������
		ShareData sd = new ShareData();
		//�����߳�
		new Thread(new Producer(sd)).start();//�������߳�
		new Thread(new Consumer(sd)).start();//�������߳�
	}
}
