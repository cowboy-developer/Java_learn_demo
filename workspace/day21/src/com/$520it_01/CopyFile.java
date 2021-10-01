package com.$520it_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		//有个问题,我们只能拷贝1.java,我想拷贝另一个文件只能修改源代码
		//直接在源代码中写死,硬编码
		//要想程序不会写死,需要把关键的变量的值写到程序的外面
		//在程序运行的时候,通过使用流把数据即时读取进来
		//使用properties文件 
		Properties pro = new Properties();
		//从流中去读取属性的配置信息
		InputStream in = new FileInputStream("file.properties");
		pro.load(in);
		
		String src = pro.getProperty("src");//alt+shift+l
		InputStream is = new FileInputStream(src);
		String dest = pro.getProperty("dest");
		OutputStream out = new FileOutputStream(dest);
		
		int len;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			out.write(b, 0, len);
		}
		
		is.close();
		out.close();
	}
}
