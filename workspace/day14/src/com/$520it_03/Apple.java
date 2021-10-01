package com.$520it_03;

public class Apple extends Thread {
	private static int num = 100;
	
	public Apple(String name) {
		super(name);
	}

	@Override
	public void run() {
		//搬苹果
		while (num > 0) {
			num--;
			System.out.println(getName() + "搬走了1箱,剩下" + num);
		}
	}
}
