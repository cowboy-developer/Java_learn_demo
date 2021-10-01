package com.$520it_04;

public class DeadLock {
	private static Object o1 = new Object();
	private static Object o2 = new Object();
	
	public static void main(String[] args) throws Exception {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					synchronized (o1) {
						System.out.println(1111);
						synchronized (o2) {
							System.out.println(2222);
						}
					}
				}
			}
		};
		t.start();

		new Thread() {
			public void run() {
				while (true) {
					synchronized (o2) {
						System.out.println(22);
						synchronized (o1) {
							System.out.println(11);
						}
					}
				}
			}
		}.start();
		Thread.sleep(2);
		System.out.println(t.getState());
	}
}
