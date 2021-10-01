package com.$520it_03;

import java.nio.charset.Charset;
import java.util.Arrays;

public class EncodeDecodeDemo {
	public static void main(String[] args) {
		//编码  把字符依靠编码表转换成字节
		String s = "罗杰斯你很牛X";
		//使用默认的字符集编码  默认就是GBK
//		byte[] bs = s.getBytes();
		byte[] bs = s.getBytes(Charset.forName("gbk"));
//		byte[] bs = s.getBytes("utf-8");
		System.out.println(bs.length);
		//默认编码/gbk每个汉字2个字节
		//utf-8每个汉字是3个字节
		System.out.println(Arrays.toString(bs));
		
//		解码  把字节通过编码表解析成字符
		//我用的utf-8来编的,应该使用utf-8来解析
//		System.out.println(new String(bs, "utf-8"));
		//使用默认/gbk进行解码
		System.out.println(new String(bs, Charset.forName("gbk")));
		//总结,要怎么处理才没有乱码 --> 编码和解码一致
	}
}
