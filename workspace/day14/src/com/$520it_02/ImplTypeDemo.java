package com.$520it_02;

public class ImplTypeDemo {
	public static void main(String[] args) {
		//3创建Runnable对象
		Runnable r = new MyRunnable();
		//4创建线程对象(Thread),把Runnable对象作为参传人
		Thread t = new Thread(r);
		//5调用线程的start方法开启线程
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("---玩游戏---");
		} 
	}
}
