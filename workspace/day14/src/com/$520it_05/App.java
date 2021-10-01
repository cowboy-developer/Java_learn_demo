package com.$520it_05;

public class App {
	public static void main(String[] args) {
//		Single s1 = Single.getInstance();
//		Single s2 = Single.getInstance();
//		Single s3 = Single.getInstance();
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		}).start();
	}
}
