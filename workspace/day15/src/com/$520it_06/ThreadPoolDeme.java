package com.$520it_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDeme {
	public static void main(String[] args) {
		//1:通过工具类的静态方法返回线程池对象
		//参数是线程的数量
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//2:给线程池分配任务
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		pool.execute(new MyRun());
		//关闭线程池
		pool.shutdown();
	}
	
	static class MyRun implements Runnable {
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 100; i++) {
				System.out.println(name + "--->" + i);
			}
			System.out.println(name + "完成任务");
		}
		
	}
}
