package com.$520it_01;

public class ShareData {
	private String name;
	private String taste;
	
	//分析:有两行为  存/取
	public void add(String name, String taste) {
		try {
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("生产了" + name + ",口味是" + taste);
		} catch (Exception e) {
		}
	}
	
	public void show() {
		try {
			Thread.sleep(10);
			System.out.println("消费了菜名:" + name + ",口味:" + taste);
		} catch (Exception e) {
		}
	}
}
