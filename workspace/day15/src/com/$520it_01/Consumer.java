package com.$520it_01;

public class Consumer implements Runnable {
	private ShareData sd; 
	
	public Consumer(ShareData sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		//�����������
		for (int i = 0; i < 100; i++) {
			sd.show();
		}
	}
}
