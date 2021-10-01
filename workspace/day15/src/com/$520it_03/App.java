package com.$520it_03;

public class App {
	public static void main(String[] args) {
		//测试
		//创建一个共享数据区域
		ShareData sd = new ShareData();
		//两个线程
		new Thread(new Producer(sd)).start();//生产者线程
		new Thread(new Consumer(sd)).start();//消费者线程
	}
}
