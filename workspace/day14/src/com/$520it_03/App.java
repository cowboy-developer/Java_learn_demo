package com.$520it_03;

public class App {
	public static void main(String[] args) {
		//��1��100��,3���߳� 
		//�̳з�ʽ
//		Thread t1 = new Apple("������");
//		Thread t2 = new Apple("������");
//		Thread t3 = new Apple("������");
		
		//ʵ�ֵķ�ʽ
		Runnable r = new AppImpl();
		Thread t1 = new Thread(r, "������");
		Thread t2 = new Thread(r, "������");
		Thread t3 = new Thread(r, "������");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
