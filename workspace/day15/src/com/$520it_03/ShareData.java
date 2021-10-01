package com.$520it_03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareData {
	private String name;
	private String taste;
	
	//标准区别谁等待
	private boolean flag;
	//true->有数据->生产者等待,反之消费者等待
	//使用锁机制
	private Lock lock = new ReentrantLock();
	//代替同步监听对象
	private Condition con = lock.newCondition();
	
	public void add(String name, String taste) {
		try {
			//代码一开始就上锁
			lock.lock();
			if (flag) {
				//改由Condition对象调用
				con.await();
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("生产了" + name + ",口味是" + taste);
			//改变标记
			flag = true;
			//生产完成后唤醒消费者
			//必须由同步监听对象调用
			con.signalAll();
		} catch (Exception e) {
		} finally {
			//释放锁
			lock.unlock();
		}
	}
	
	public void show() {
		try {
			lock.lock();
			if (!flag) {
				//必须由同步监听对象调用等待的方法
				con.await();
			}
			
			Thread.sleep(10);
			System.out.println("消费了菜名:" + name + ",口味:" + taste);
			//改变标记
			flag = false;
			//消费完成唤醒生产者
			//必须由同步监听对象调用
			con.signalAll();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
}
