package com.$520it_06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tick implements Runnable {
	// ��1000��Ʊ
	private int tick = 1000;
	
	//����һ��������
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// ��Ʊ
		while (true) {
			try {
				// ������Ҫͬ��-->����
				lock.lock();
				if (tick > 0) {
					// ��Ʊ-->��
					tick--;
					String name = Thread.currentThread().getName();
					Thread.sleep(2);
					System.out.println(name + "������1��ʣ��" + tick);
				} else {
					// û��Ʊ��
					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// ������Ҫ����
				lock.unlock();
			}
		}
	}
}
