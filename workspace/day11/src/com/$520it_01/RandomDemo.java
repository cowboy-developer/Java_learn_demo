package com.$520it_01;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
//		创建对象
		Random r = new Random();
		/*
		//产生0-1的随机数
		double d = r.nextDouble();
		System.out.println(d);
		//产生整数随机数最好
		int i = r.nextInt();
		System.out.println(i);
		//产生一个大于0小于100的随机整数
		i = r.nextInt(100);
		System.out.println(i);
		*/
		
		//设计一个程序,有15%的概率产生450%的暴击
		//思路:1产生一个随机数0-100的随机数
		int ran = r.nextInt(100);
		//2判断这个随机数是否符合15%的要求
		if (ran < 15) {
			System.out.println("取你性命,造成450%的伤害!");
		} else {
			System.out.println("人品不好!!!");			
		}
		
		//产生一个随机数[34,87)  
		//思路:1产生一个最大值-最小值的随机数   [0,53)
		int i = r.nextInt(87 - 34);
		//2在这个随机数的基础上加最小值  i + 34
		System.out.println(i + 34);
	}
}
