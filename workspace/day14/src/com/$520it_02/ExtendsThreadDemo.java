package com.$520it_02;

public class ExtendsThreadDemo {
	public static void main(String[] args) {
		//�����̶߳���
		Thread t = new MyThread();
		//�����߳�
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("---����Ϸ---");
		} 
	}
}
