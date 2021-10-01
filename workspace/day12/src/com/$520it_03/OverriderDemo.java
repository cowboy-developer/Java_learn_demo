package com.$520it_03;

public class OverriderDemo {
	public static void main(String[] args) {
//		new Fu().work();
	}
}

class Fu {
	public void work() throws Exception {
		System.out.println("“Ï≥£");
	}
}

class Zi extends Fu{
	@Override
	public void work() {
		
	}
}
