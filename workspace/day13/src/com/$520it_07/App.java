package com.$520it_07;

public class App {
	public static void main(String[] args) {
		//多态
		//有了继承后子类也是特殊的父类
		Fu f = new Zi();
		//成员调用的含义
		//编译-->去Fu中找变量i
		System.out.println(f.i);
		//运行-->运行的是Zi对象的Fu空间i
		
		//但是调用方法则不一样
		f.work();
		//多态下如果调用的方法被子类重写,调用出来的是子类的方法
		//此时是不能调用到子类的特有方法
		//编译时只管去声明的类型(Fu)中找sub方法
//		f.sub();找不到报错
		
		Zi z = new Zi();
		z.sub();
		//静态的使用类名调用
		f.get();//-->Fu.get()
		z.get();//-->Zi.get()
		
		//一下情况是Zi中没有get的静态方法
		z.get();//-->Fu.get()
	}
}
