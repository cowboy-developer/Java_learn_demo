package com.$520it_03;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//创建对象   Date对象表示的是时间的毫秒值
		//无参构造表示的是当前时间
		Date d = new Date();
		System.out.println(d);
		//表示的是历元
//		d = new Date(0);
		d = new Date(System.currentTimeMillis());
		System.out.println(d);
		//出现这个问题主要是我们调用了过时的方法,工具警告我们
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
	}
}
