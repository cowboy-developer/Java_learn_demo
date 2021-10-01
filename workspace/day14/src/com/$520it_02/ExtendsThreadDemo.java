package com.$520it_02;

public class ExtendsThreadDemo {
	public static void main(String[] args) {
		//创建线程对象
		Thread t = new MyThread();
		//开启线程
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("---玩游戏---");
		} 
	}
}
