package com.$520it_02;

public class App {
	public static void main(String[] args) {
		//创建一个队伍
		Team t = new Team();
		//队伍只有5个容量
		//添加两个队员
		t.add(10);
		t.add(20);
		t.add(20);
		t.add(20);
		t.add(20);
		t.add(10);

		/*
		//查询0号位置上的队员
		System.out.println(t.get(10));
		//找出20对象所在是位置
		int i = t.indexOf(20);
		System.out.println("20-->" + i);
		//10队员受伤了,替换成1
		t.set(0, 1);
		 */
		//20对英勇就义了
		t.remove(0);
		//查看队伍的人数
		System.out.println(t.size());
		//查看所有队员
		System.out.println(t);
	}
}
