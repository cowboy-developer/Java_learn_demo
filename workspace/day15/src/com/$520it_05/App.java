package com.$520it_05;

public class App {
	public static void main(String[] args) throws Exception {
		//演示线程的优先级
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		//线程的优先级然并卵,仅仅是获得执行的可能高一点
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	private static void work2() {
		//测试后台线程
		Thread thread = Thread.currentThread();
		//false说明主线程不是后台线程
		System.out.println(thread.isDaemon());
		
		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("1111");
				}
			}
		};
		//设置线程为后台线程,设置后台线程一定要在开启之前
		t.setDaemon(true);
		t.start();
		//当所有的前台线程都死亡后,JVM就会退出
		System.out.println(t.isDaemon());
	}

	private static void work1() throws InterruptedException {
		System.out.println("洗菜");
		System.out.println("切菜");
		System.out.println("炒菜");
		System.out.println("调味");
		System.out.println("没有调料了");
		//叫人去买调料
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("拿钱");
				System.out.println("下楼");
				System.out.println("买调料");
				System.out.println("回来");
			}
		};
		t.start();
		//联合线程,等待支线程完成后主线程再继续
		t.join();
		
		System.out.println("炒菜");
		System.out.println("上菜");
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			获取线程的名称
			String name = Thread.currentThread().getName();
			System.out.println(name + "-->" + i);
		}
	}
}
