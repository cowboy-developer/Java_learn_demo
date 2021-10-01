package com.$520it_03;

public class App {
	public static void main(String[] args) {
		//有1个100箱,3个线程 
		//继承方式
//		Thread t1 = new Apple("王尼玛");
//		Thread t2 = new Apple("任真天");
//		Thread t3 = new Apple("赵铁柱");
		
		//实现的方式
		Runnable r = new AppImpl();
		Thread t1 = new Thread(r, "王尼玛");
		Thread t2 = new Thread(r, "任真天");
		Thread t3 = new Thread(r, "赵铁柱");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
