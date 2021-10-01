package com.$520it_01;

import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("c:/1.txt");
		//读操作
		read(reader);
		reader.close();
		/*
		InputStream is = new FileInputStream("c:/1.java");
		int i = is.read();
		System.out.println((char) i);
		is.close();	
		*/
	}

	private static void read(Reader reader) throws Exception {
		char[] buf = new char[5];
		//读取数据到缓冲数组中
		int len;
		while ((len = reader.read(buf)) != -1) {
			//不要全部拿去,读了多少拿多少
			System.out.println(new String(buf, 0, len));
		}
		/*
		int len = reader.read(buf);
		System.out.println(len);*/
		/*//读取1个字符  由此可见读取纯文本文件使用字符流
		int data = reader.read();
		System.out.println((char)data);
		data = reader.read();
		System.out.println((char)data);
		data = reader.read();
		System.out.println((char)data);*/
	}
}
