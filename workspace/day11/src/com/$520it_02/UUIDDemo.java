package com.$520it_02;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		/*
		//获取UUID对象
		UUID u = UUID.randomUUID();
		System.out.println(u);
		//再获取一个UUID
		u = UUID.randomUUID();
		System.out.println(u);
		//再获取一个UUID
		u = UUID.randomUUID();
		System.out.println(u);
		*/
		//UUID在计算机界唯一
		//需求获取第一个4位数作为验证码
		//使用String的subString方法
		UUID u = UUID.randomUUID();
		String str = u.toString();
		//通过方法拿到字符的索引
		//第一个'-'的索引 为了方便后面+1
		int firIndex = str.indexOf('-') + 1;
		//第二个'-'的索引
		int secIndex = str.indexOf('-', firIndex);
		str = str.substring(firIndex, secIndex);
		System.out.println(str);
	}
}
