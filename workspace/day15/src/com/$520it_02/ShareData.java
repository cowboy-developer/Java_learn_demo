package com.$520it_02;

public class ShareData {
	private String name;
	private String taste;
	
	//标准区别谁等待
	private boolean flag;
	//true->有数据->生产者等待,反之消费者等待
	
	//在方法上加同步
	public synchronized void add(String name, String taste) {
		try {
			if (flag) {
				//必须由同步监听对象调用等待的方法
				this.wait();
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("生产了" + name + ",口味是" + taste);
			//改变标记
			flag = true;
			//生产完成后唤醒消费者
			//必须由同步监听对象调用
			this.notifyAll();
		} catch (Exception e) {
		}
	}
	
	public synchronized void show() {
		try {
			if (!flag) {
				//必须由同步监听对象调用等待的方法
				this.wait();
			}
			
			Thread.sleep(10);
			System.out.println("消费了菜名:" + name + ",口味:" + taste);
			//改变标记
			flag = false;
			//消费完成唤醒生产者
			//必须由同步监听对象调用
			this.notifyAll();
		} catch (Exception e) {
		}
	}
}
