package com.$520it_02;

public class ImplTypeDemo {
	public static void main(String[] args) {
		//3����Runnable����
		Runnable r = new MyRunnable();
		//4�����̶߳���(Thread),��Runnable������Ϊ�δ���
		Thread t = new Thread(r);
		//5�����̵߳�start���������߳�
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("---����Ϸ---");
		} 
	}
}
