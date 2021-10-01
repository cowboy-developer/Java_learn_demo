package com.$520it_05;

public class Single {
	private Single() {}
	//饿汉单例模式
//	private static Single s = new Single();
	//懒汉式
	private static Single s;
	
	/*public static Single getInstance() {
		if (s == null) {
			synchronized(Single.class) {
				if (s == null) {
					s = new Single();
				}
			}
		}
		return s;
	}*/
	public static synchronized Single getInstance() {
		if (s == null) {
			s = new Single();
		}
		return s;
	}
}
