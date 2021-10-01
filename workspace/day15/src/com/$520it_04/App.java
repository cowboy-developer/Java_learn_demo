package com.$520it_04;

public class App {
	public static void main(String[] args) throws Exception {
		//�̵߳�״̬
		Thread t = new Thread() {
			@Override
			public void run() {
//				try {
//					Thread.sleep(10);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		};
		t.start();
		Thread.sleep(2);
		System.out.println(t.getState());
	}
}
