package com.$520it_03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStreamDemo {
	public static void main(String[] args) throws Exception {
		input();
	}

	private static void input() {
		byte[] bs = {1,3,54,6,7,8,9};
		//可以把字节数组当成一个流来使用
		ByteArrayInputStream in = new ByteArrayInputStream(bs);
		int data;
		while ((data = in.read()) != -1) {
			System.out.println(data);
		}
	}

	private static void output() throws Exception {
		//字节数组输出流
		//模拟有很多数据
		String s1 = "数据1";
		String s2 = "数据2";
		String s3 = "数据3";
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		//模拟先加载一部分数据
		out.write(s1.getBytes());
		System.out.println(out.toString());
		//这个类的writer方法是用于收集数据的
		out.write(s2.getBytes());
		System.out.println(out.toString());
		out.write(s3.getBytes());
		//收集的数据最后统一呈现
		System.out.println(out.toString());
		//获取所有的字节数据
		byte[] bs = out.toByteArray();
		System.out.println(Arrays.toString(bs));
	}
}
