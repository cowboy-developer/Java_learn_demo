package com.$520it_06;

import com.$520it_06.Tick;

public class App {
	public static void main(String[] args) {
		//ֻ��1��1000��Ʊ
		Runnable r = new Tick();
		//����5������-->5���߳�
		//����1:�������   ����2:�̵߳�����
		Thread t1 = new Thread(r, "��ȫ��");
		Thread t2 = new Thread(r, "������");
		Thread t3 = new Thread(r, "����");
		Thread t4 = new Thread(r, "��С��");
		Thread t5 = new Thread(r, "������");
		
		//�����߳̿�ʼ��Ʊ
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
