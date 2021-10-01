package com.$520it_02;

public class Day03App {
	public static void main(String[] args) {
		//循环结构    while  for
		//()中是一个boolean表达式,作用是控制循环
		int i = 0;
		while (i++ < 10) {
			if (i == 6) {
				System.out.println("累了,不玩了");
				break;
			}
			System.out.println("hello" + i);
		}
		
		//循环起的作用都是一样,但是跟次数有关的循环我们会使用for
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
				System.out.println("不吉利,不要");
				continue;
			}
			System.out.println("hello" + j);
		}
	}

	private static void work1() {
		/*
		//选择结构 if   if-else   if-else if...else
		//如果是单一语句,并且这个语句是有条件的执行 --> if
		char c = '红';
		if (c == '绿') {
			System.out.println("过马路");
		}
		
		//二选一
		if (false) {
			//true -> 执行
			System.out.println("要钱");
		} else {
			//false -> 执行
			System.out.println("要命");
		}
		
		
		//在多个条件中选择
		int day = 4;
		if (day == 1) {
			System.out.println("发工资");
		} else if (day == 2) {
			System.out.println("发奖金");
		} else if (day == 3) {
			System.out.println("中彩票");
		} else {
			System.out.println("破产");
		}
		
		
		//其实switch相等于多重的ifelse
		int day = 1;
		//只支持int/short/char/byte还有他们的包装类
		switch (Integer.valueOf(1).intValue()) {
			//这个语句的特点会一直执行直到遇到break或者执行完毕
			//匹配只有1次作用,匹配一次后所有case失效
			case 1:
				System.out.println("发工资");
				
			case 2:
				System.out.println("发奖金");
				break;
			case 3:
				System.out.println("中彩票");
				break;
			default:
				System.out.println("破产");
		}
		*/
		String s = "a";
		switch (s) {
			case "a":
				System.out.println('a');
				break;
		}
	}
}
