package com.$520it_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDeme {
	public static void main(String[] args) {
		//1:ͨ��������ľ�̬���������̳߳ض���
		//�������̵߳�����
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//2:���̳߳ط�������
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		//�ر��̳߳�
		pool.shutdown();
	}
	
	static class MyRun implements Runnable {
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 100; i++) {
				System.out.println(name + "--->" + i);
			}
			System.out.println(name + "�������");
		}
		
	}
}
