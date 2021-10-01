package com.$520it_07;

public class Fu {
	public static void get() {
		System.out.println("...fu static...");
	}
	
	public Fu(int i) {
		this.i = i;
		System.out.println("super init");
	}
	
	int i = 1;
	
	
	public void work() {
		System.out.println("..Fu..");
	}
	
	public static void main(String[] args) {
		A a = new A() 
		{
			@Override
			public void work() {}
		};
	}
}

interface A {
	void work();
}
