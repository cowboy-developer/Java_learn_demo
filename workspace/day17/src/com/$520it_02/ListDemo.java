package com.$520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("罗杰斯");
		list.add("托尼");
		list.add(111);
		list.add("巴基");
		list.add("鹰眼");
		list.add("绿巨人");
		list.add(new Date());
//		System.out.println(list);
		work3(list);
	}
	
	private static void work3(List list) {
		//使用List特有的迭代器
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//必须基于next移动位置后才能使用
			it.set("神油");
		}
		it.add("老虎油");
		System.out.println(list);
		System.out.println("----------------");
		while (it.hasPrevious()) {//判断是否有上一个元素
			//取出上一个
			System.out.println(it.previous());
		}
	}

	private static void work2(List list) {
		//使用面向对象的方式迭代List-->迭代器
		//1:获取迭代器
		Iterator it = list.iterator();
		//取出元素前,应该先判断是否还有元素
		while (it.hasNext()) {
			//如果再取出元素
			//取出下一个的元素
			System.out.println(it.next());
			//ConcurrentModificationException
			//使用迭代器迭代的过程中不能对原集合中的元素修改
//			list.remove(0);
			//使用删除方法要先获取,才能删除
//			it.remove();
		}
		System.out.println(list);
	}
	
	private static void work1(List list) {
		//使用循环迭代
		//1:把集合转变成数组
//		Object[] arr = list.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//思考:-->集合中能拿到数组的个数吗,集合能获取索引对应的元素吗
		//转变后数组的长度相当于集合元素的个数,使用get(index);
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
