package com.$520it_04;

public class Tick implements Runnable {
	//有1000张票
	private int tick = 1000;

	/*@Override
	public void run() {
		//使用同步的方法,就是在方法上加synchronized
		//同步的方法同时只能有1个线程执行里面的代码
		try {
			while (true) {
				if(work()) {
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	//一般来讲同步的方法都比较少使用,同步监听对象是this
	private synchronized boolean work() throws Exception {
		if (tick > 0) {
			tick--;
			String name = Thread.currentThread().getName();
			Thread.sleep(2);
			System.out.println(name + "卖出了1张剩下" + tick);
			return false;
		} else {
			return true;
		}
	}
	
	
	
	@Override
	public void run() {
		try {
			//卖票
			while (true) {
				//凡是有操作共享资源的代码都要同步
				//这里tick就是共享资源,凡有有tick的就要同步
				//synchronized(同步监听对象)
				//必须保证同步的监听对象始终是同一个对象
//				synchronized (new Object()) {
				synchronized (Tick.class) {
					if (tick > 0) {
						//有票-->卖
						tick--;
						String name = Thread.currentThread().getName();
						Thread.sleep(2);
						System.out.println(name + "卖出了1张剩下" + tick);
					} else {
						//没有票了
						return;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
