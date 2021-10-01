package com.$520it_06;

import java.util.Random;

public class ThreadLocalDemo {
	private static ThreadLocal local = new ThreadLocal();
	private static Random random = new Random();
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(String.valueOf(i)) {
				public void run() {
					//生产一个随机数
					int value = random.nextInt();
					
					System.out.println(getName() + "生产的值是" + value);
					//往线程局部中存数据
					local.set(value);
					//创建两个对象,访问当前线程在线程局部中设置的值
					new A().show();
					new B().show();
				}
			}.start();
		}
	}
	
	static class A {
		public void show() {
			Object obj = local.get();
			String name = Thread.currentThread().getName();
			System.out.println(name + "--A--在ThreadLocal中存入的值是" + obj);
		}
	}
	
	static class B {
		public void show() {
			Object obj = local.get();
			String name = Thread.currentThread().getName();
			System.out.println(name + "--B--在ThreadLocal中存入的值是" + obj);
		}
	}
	
}
