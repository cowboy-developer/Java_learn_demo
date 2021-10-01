package com.$520it_03;

public class MethodDemo {
	public static void main(String[] args) {
//		静态只能访问静态
		work();
		//为什么main方法的修饰符是public static
//		public是为了保证方法在任何地方都能调用
//		static为了方便JVM调用,直接类名调用
	}
	//方法的结构-->参照main方法
//	[修饰符] 返回值类型(基本类型/引用类型) 方法名([形参列表]) {方法体}
	/*
	 	修饰符符是用来修饰符方法的 访问权限等
	 	返回值类型指的调用方法后返回结果给调用者,没有结果写void
	 	形参列表其实就是定义n个变量,完成方法缺少的未知因素定义成形参
	 	方法体:如果方法的返回值不是void则方法执行的最后一个语句必须是[return 对象]
	 */
	public static void work() {
		System.out.println("...work hard");
	}
	public static void work(int i) {
		System.out.println("...work hard");
	}
	public static void work(String a, int i) {	}
	public static void work(int a, String i) {	}
}
