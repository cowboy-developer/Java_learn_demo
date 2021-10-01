package com.$520it_04;

public class Day04App {
	public static void main(String[] args) {
		//数组的初始化
		//类型[] 表示一维数组
//		int[] arr = {1,2};//静态初始化
//		int[] arr = new int[]{1,2};//静态初始化
//		arr = {1,2,3};简写的方式只能用在定义马上初始化
		
		//动态是我们给数组的长度
		//创建一个int数组有10个长度
		int[] arr = new int[10];
		//给arr的第2个索引赋值
		//赋值 :  变量名  = 对象
		arr[1] = 5;
		//访问值     直接访问变量名
		System.out.println(arr[1]);
		/*
		//要遍历要数组的元素,必须知道数组的长度
		//获取数组的长度     数组对象.length
		System.out.println(arr.length);
		System.out.println("----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		for (int i : arr) {
			System.out.println(i);
		}
		*/
		arr = null;
//		NullPointerException对象没有地址调用了其成员
		arr.toString();
		//ArrayIndexOutOfBoundsException访问了不存在的索引
		arr[-1] = 10;
	}
}
