package com.$520it_02;
/*
 1．自定义类继承于Thread类，那么该自定义类就是线程类；
 2．覆写run方法，将线程运行的代码存放在run中；
 3．创建自定义类的对象，即线程对象；
 4．调用线程对象的start方法，启动线程。
 */
public class MyThread extends Thread {
	//重写run方法,重写后也一样不能抛异常
	@Override
	public void run() {
		//这个线程专门听歌
		for (int i = 0; i < 1000; i++) {
			System.out.println("...听歌...");
		}
	}
}
