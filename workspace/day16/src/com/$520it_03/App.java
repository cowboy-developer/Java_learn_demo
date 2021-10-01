package com.$520it_03;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		//创建一个队伍
		MyArrayList t = new MyArrayList();

		t.add("haha");
		t.add(10);
		t.add(new Date());
		
		//清空所有元素
		t.clear();
		t.add(10);
		System.out.println(t.isEmpty());
		//查看队伍的人数
		System.out.println(t.size());
		//查看所有队员
		System.out.println(t);
	}
}
