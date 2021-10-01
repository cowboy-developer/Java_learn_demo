package com.$520it_01;

public class ThrowableDemo {
	public static void main(String[] args) {
		//演示异常
//		Throwable t = new Throwable();没有异常信息,没有意义
		//使用异常的原因创建对象
		Throwable t = new Throwable("长得比较丑");
		//打印异常栈/异常原因
		String msg = t.getMessage();//获取异常的原因
		System.out.println(msg);
		//打印异常的详细信息
		t.printStackTrace();
	}
}
