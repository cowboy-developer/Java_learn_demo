package com.$520it_02;

//1自定义一个类实现Runnable接口
public class MyRunnable implements Runnable {
	//2重写run方法,把线程要执行任务代码放进去
	@Override
	public void run() {
		//这个线程专门听歌
		for (int i = 0; i < 1000; i++) {
			System.out.println("...听歌...");
		}
	}

}
