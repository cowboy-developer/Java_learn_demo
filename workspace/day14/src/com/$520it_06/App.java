package com.$520it_06;

import com.$520it_06.Tick;

public class App {
	public static void main(String[] args) {
		//只有1个1000张票
		Runnable r = new Tick();
		//创建5个窗口-->5个线程
		//参数1:任务对象   参数2:线程的名称
		Thread t1 = new Thread(r, "张全蛋");
		Thread t2 = new Thread(r, "王尼玛");
		Thread t3 = new Thread(r, "铁根");
		Thread t4 = new Thread(r, "易小星");
		Thread t5 = new Thread(r, "唐马儒");
		
		//开启线程开始卖票
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
