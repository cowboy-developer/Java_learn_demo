package com.$520it_06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tick implements Runnable {
	// 有1000张票
	private int tick = 1000;
	
	//定义一个锁对象
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// 卖票
		while (true) {
			try {
				// 这里需要同步-->加锁
				lock.lock();
				if (tick > 0) {
					// 有票-->卖
					tick--;
					String name = Thread.currentThread().getName();
					Thread.sleep(2);
					System.out.println(name + "卖出了1张剩下" + tick);
				} else {
					// 没有票了
					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 这里需要解锁
				lock.unlock();
			}
		}
	}
}
