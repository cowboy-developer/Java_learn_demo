package com.$520it_03;

public class AppImpl implements Runnable {
	//有1个100箱
	private int num = 100;
	
	@Override
	public void run() {
		//搬苹果
		while (num > 0) {
			num--;
			//由于我使用实现的方式没有getName方法
			//获取当前的线程对象
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "搬走了1箱,剩下" + num);
		}
	}

}
