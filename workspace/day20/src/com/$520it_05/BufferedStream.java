package com.$520it_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStream {
	public static void main(String[] args) throws Exception {
		byCharStream();
	}

	private static void byCharStream() throws Exception {
		//字符缓冲流
		BufferedReader reader = new BufferedReader(
				new FileReader("c:/1.java"));
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("c:/2.java"));
		String data;
		long s = System.currentTimeMillis();
		//直接读取一行数据
		while ((data = reader.readLine()) != null) {
//			System.out.println(data);
			writer.write(data);
			//写一个换行符
			writer.newLine();
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		
		reader.close();
		writer.close();
	}

	private static void byByteStream() throws Exception {
		//普通字节流拷贝文件使用312
		//缓冲流使用时间112
		BufferedInputStream is = new BufferedInputStream(
				new FileInputStream("c:/setup.exe"));
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream("c:/1.exe"));
		int len;
		byte[] buf = new byte[1024];
		long s = System.currentTimeMillis();
		//先读取数据,再写数据
		while ((len = is.read(buf)) != -1) {
			//边读边写
			out.write(buf, 0, len);
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		
		is.close();
		out.close();
	}
	
	
}
