package com.$520it_01;

public class MathDemo {
	public static void main(String[] args) {
		//演示绝对值      返回这个数的正数形式
		System.out.println(Math.abs(-10));
		//开立方    开三次方
		System.out.println(Math.cbrt(-8));
		//正数舍弃小数+1,负数舍弃小数
		System.out.println(Math.ceil(-1.9));
		//正数舍弃小数,负数舍弃小数再-1
		System.out.println(Math.floor(1.9));
		//返回两个数中的最大值
		System.out.println(Math.max(100, 100.1));
		//返回两个数中的最小值
		System.out.println(Math.min(100, 100.1));
		//第一个参数的第二个参数次方
		System.out.println(Math.pow(10,2));
		//四舍五入
		System.out.println(Math.round(10.4));
		//开平方,只有正数才能开平
		System.out.println(Math.sqrt(9));
		
		//产生一个随机的数[0.0,1.0)
		System.out.println(Math.random());
		//产生一个0-100的随机数
		System.out.println((int) Math.random() * 100);
	}
}
