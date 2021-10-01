package com.$520it_02;

public class ShareData {
	private String name;
	private String taste;
	
	//��׼����˭�ȴ�
	private boolean flag;
	//true->������->�����ߵȴ�,��֮�����ߵȴ�
	
	//�ڷ����ϼ�ͬ��
	public synchronized void add(String name, String taste) {
		try {
			if (flag) {
				//������ͬ������������õȴ��ķ���
				this.wait();
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("������" + name + ",��ζ��" + taste);
			//�ı���
			flag = true;
			//������ɺ���������
			//������ͬ�������������
			this.notifyAll();
		} catch (Exception e) {
		}
	}
	
	public synchronized void show() {
		try {
			if (!flag) {
				//������ͬ������������õȴ��ķ���
				this.wait();
			}
			
			Thread.sleep(10);
			System.out.println("�����˲���:" + name + ",��ζ:" + taste);
			//�ı���
			flag = false;
			//������ɻ���������
			//������ͬ�������������
			this.notifyAll();
		} catch (Exception e) {
		}
	}
}
