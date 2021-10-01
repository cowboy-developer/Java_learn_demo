package com.$520it_05;

public class App {
	public static void main(String[] args) throws Exception {
		//��ʾ�̵߳����ȼ�
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		//�̵߳����ȼ�Ȼ����,�����ǻ��ִ�еĿ��ܸ�һ��
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	private static void work2() {
		//���Ժ�̨�߳�
		Thread thread = Thread.currentThread();
		//false˵�����̲߳��Ǻ�̨�߳�
		System.out.println(thread.isDaemon());
		
		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("1111");
				}
			}
		};
		//�����߳�Ϊ��̨�߳�,���ú�̨�߳�һ��Ҫ�ڿ���֮ǰ
		t.setDaemon(true);
		t.start();
		//�����е�ǰ̨�̶߳�������,JVM�ͻ��˳�
		System.out.println(t.isDaemon());
	}

	private static void work1() throws InterruptedException {
		System.out.println("ϴ��");
		System.out.println("�в�");
		System.out.println("����");
		System.out.println("��ζ");
		System.out.println("û�е�����");
		//����ȥ�����
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("��Ǯ");
				System.out.println("��¥");
				System.out.println("�����");
				System.out.println("����");
			}
		};
		t.start();
		//�����߳�,�ȴ�֧�߳���ɺ����߳��ټ���
		t.join();
		
		System.out.println("����");
		System.out.println("�ϲ�");
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			��ȡ�̵߳�����
			String name = Thread.currentThread().getName();
			System.out.println(name + "-->" + i);
		}
	}
}
