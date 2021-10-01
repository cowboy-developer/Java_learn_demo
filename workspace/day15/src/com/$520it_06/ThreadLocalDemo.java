package com.$520it_06;

import java.util.Random;

public class ThreadLocalDemo {
	private static ThreadLocal local = new ThreadLocal();
	private static Random random = new Random();
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(String.valueOf(i)) {
				public void run() {
					//����һ�������
					int value = random.nextInt();
					
					System.out.println(getName() + "������ֵ��" + value);
					//���ֲ߳̾��д�����
					local.set(value);
					//������������,���ʵ�ǰ�߳����ֲ߳̾������õ�ֵ
					new A().show();
					new B().show();
				}
			}.start();
		}
	}
	
	static class A {
		public void show() {
			Object obj = local.get();
			String name = Thread.currentThread().getName();
			System.out.println(name + "--A--��ThreadLocal�д����ֵ��" + obj);
		}
	}
	
	static class B {
		public void show() {
			Object obj = local.get();
			String name = Thread.currentThread().getName();
			System.out.println(name + "--B--��ThreadLocal�д����ֵ��" + obj);
		}
	}
	
}
