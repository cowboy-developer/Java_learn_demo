package com.$520it_03;

public class AppImpl implements Runnable {
	//��1��100��
	private int num = 100;
	
	@Override
	public void run() {
		//��ƻ��
		while (num > 0) {
			num--;
			//������ʹ��ʵ�ֵķ�ʽû��getName����
			//��ȡ��ǰ���̶߳���
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "������1��,ʣ��" + num);
		}
	}

}
