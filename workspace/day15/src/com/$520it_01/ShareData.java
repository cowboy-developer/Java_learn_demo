package com.$520it_01;

public class ShareData {
	private String name;
	private String taste;
	
	//����:������Ϊ  ��/ȡ
	public void add(String name, String taste) {
		try {
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("������" + name + ",��ζ��" + taste);
		} catch (Exception e) {
		}
	}
	
	public void show() {
		try {
			Thread.sleep(10);
			System.out.println("�����˲���:" + name + ",��ζ:" + taste);
		} catch (Exception e) {
		}
	}
}
