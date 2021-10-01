package com.$520it_01;

public class Producer implements Runnable {
	private ShareData sd; 
	
	public Producer(ShareData sd) {
		super();
		this.sd = sd;
	}
	
	@Override
	public void run() {
		//Éú²úÊı¾İ
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				sd.add("--ÂéÀ±Ğ¡ÁúÏº--", "--ÂéÀ±--");
			} else {
				sd.add("!!Â±¼¦ÍÈ!!", "!!ÎåÏãÎ¶!!");
			}
		}
	}
}
