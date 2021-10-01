package com.$520it_01;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//创建一个Vector对象
		List list = new Vector();
		//往集合中添加元素
		list.add("haha");
		list.add("heihei");
		list.add(Integer.valueOf(123));
		
		System.out.println(list.size());
		System.out.println(list);
		
		//查询
		Object obj = list.get(1);
		System.out.println(obj);
		//查看是否包含heihei
		System.out.println(list.contains("hei1hei"));
		
		list.remove(Integer.valueOf(123));
		System.out.println(list.size());
		System.out.println(list);
	}
}
