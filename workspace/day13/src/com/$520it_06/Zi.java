package com.$520it_06;

public class Zi extends Fu {
	public Zi() {
		//子类的构造方法第一行默认不是this()就是super()
//		super();//调用父类的无参构造
		//如果父类没有无参构造,则必须手动调用父类的构造方法
		super(1);
	}
	
	public Zi(int i) {
		this();
		this.i = i;
	}
	
	int i = 10;
//	重写父类的work方法
	@Override
	public void work() {
		System.out.println("..Zi..");
		//调用被隐藏的方法  ..Fu..
		//调用当前类的父类的work方法
		super.work();
		//去Zi的父类中去work方法
		//super表示的是当前类的父类型
		System.out.println(super.i);
	}
}
