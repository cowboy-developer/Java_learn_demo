package com._520it_01;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		/*
		String str = "  \t  a \n ";
		boolean flag = Strings.isEntity(str);
		System.out.println(flag);
		*/
		switch ("a") {
			case "c":
				System.out.println("c");
				break;
			case "a":
				System.out.println("a");
			case "b":
				System.out.println("b");
		}
 	}

	private static void work4() {
		int i = 20;
		String j = "haha";
		//字符串拼接方法
		String s = "i = " + i + ", j = " + j;
		System.out.println(s);
		//参数1:要格式字符串   参数2:替换值
		//使用占位符   %s 表示字符串    %d 表示整数
		String str = "i = %d, j = %s";
		String ns = String.format(str, i, j);
		System.out.println(ns);
	}

	private static void work3() {
		String s = "asdDSfquGYdsFwq";
//		charAt方法     返回指定索引的字符
		char c = s.charAt(2);
		System.out.println(c);
//		toCharArray方法    转变成字符数组
		char[] ds = s.toCharArray();
		System.out.println(Arrays.toString(ds));
//		endsWith方法     判断是否以...结尾
		boolean flag = s.endsWith("w1q");
		System.out.println(flag);
		
//		equalsIgnoreCase方法     在equals的基础上忽略大小写
		flag =  s.equalsIgnoreCase("as1dsfqugydsfwq");
		System.out.println(flag);
//		getBytes方法     查编码表 转变成byte[]
		byte[] bs = s.getBytes();
		System.out.println(Arrays.toString(bs));
//		indexOf方法      某字符第一次出现的索引
		int i = s.indexOf("1sdD");
		System.out.println(i);
//		lastIndexOf方法     某字符最后一次出现的索引
		i = s.lastIndexOf("wq");
		System.out.println(i);
		
//		length方法      返回字符串的长度
		System.out.println(s.length());
//		startsWith方法     判断是否以...开头
		flag = s.startsWith("aas");
		System.out.println(flag);
//		substring方法       截取字符串 [s,e)不包含e索引
		String ns = s.substring(0, 5);
		System.out.println(ns);
		
//		toLowerCase方法       转小写
		System.out.println(s.toLowerCase());
//		toUpperCase方法       转大写
		System.out.println(s.toUpperCase());
//		trim方法       去掉首尾所有的空白字符,中间的空格忽略
		String str = "\t   a   a     ";
		System.out.println(str.trim());
//		split方法	   切割字符串
		str = ".exe;.jpg;.html";
		String[] split = str.split(";");
		System.out.println(Arrays.toString(split));
	}

	private static void work2() {
		//判断字符串对象是否相同(同一个对象)
		String s1 = "asd";
		String s2 = "asd";
		System.out.println(s1 == s2);//true
		
		String s3 = new String("asd");
		//System.out.println(s1 == s3);//false
		//应该使用equals
		System.out.println(s1.equals(s3));
		
		String s4 = "as" + "d";
		System.out.println(s1 == s4);//true
		
		String s5 = "a";
		String s6 = s5 + "sd";
		//System.out.println(s1 == s6);//false
		System.out.println(s1.equals(s6));
		
		/*//到底创建几个对象呢
		String s1 = "asd";//如果有这行代码,下面则创建1个对象
		//堆上的asd的副本
		//-------------
		//创建了两个对象:第一个是常量池的asd
		//			第二个是堆上的asd的副本
		String s3 = new String("asd");*/
	}

	private static void work1() {
		/*
		//创建对象
		//常量方式
		String s = "abc";
		//使用构造方法的方式
		//根据编码表的字符转变成字符串,必须以byte[]的形式
		s = new String(new byte[] {97, 98, 99});
		System.out.println(s);
		
		//其实底层就是把我的数组拷贝了一份给底层的常量数组
		s = new String(new char[] {'a', 'b', 'c'});
		System.out.println(s);
		
		s = new String("abc");
		System.out.println(s);
		*/
		
		//字符串的空值问题
		//表示s变量没有保存地址,没有对象
		String s = null;
		//这种方式是不能调用成员的,调用的结果就是空指针异常
		s.toString();
		//这个表示的是有引用地址,有对象,只不过这个对象底层的数组没有内容
		s = "";// char[0]
		//这种是可以调用对象的成员的
		s.toString();
	}
}
