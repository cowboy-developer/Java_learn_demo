package com.$520it_03;

public class Apple extends Thread {
	private static int num = 100;
	
	public Apple(String name) {
		super(name);
	}

	@Override
	public void run() {
		//��ƻ��
		while (num > 0) {
			num--;
			System.out.println(getName() + "������1��,ʣ��" + num);
		}
	}
}
