package com.$520it_05;

public class Single {
	private Single() {}
	//��������ģʽ
//	private static Single s = new Single();
	//����ʽ
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
