// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringDemo.java

package com._520it_01;

import java.io.PrintStream;
import java.util.Arrays;

public class StringDemo
{

	public StringDemo()
	{
	}

	public static void main(String args[])
	{
		String s;
		(s = "a").hashCode();
		JVM INSTR lookupswitch 3: default 103
	//	               97: 40
	//	               98: 52
	//	               99: 64;
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		if (!s.equals("b"))
			break; /* Loop/switch isn't completed */
		  goto _L5
_L4:
		if (s.equals("c"))
			System.out.println("c");
		break; /* Loop/switch isn't completed */
_L2:
		if (!s.equals("a"))
			break; /* Loop/switch isn't completed */
		System.out.println("a");
_L5:
		System.out.println("b");
	}

	private static void work4()
	{
		int i = 20;
		String j = "haha";
		String s = (new StringBuilder("i = ")).append(i).append(", j = ").append(j).toString();
		System.out.println(s);
		String str = "i = %d, j = %s";
		String ns = String.format(str, new Object[] {
			Integer.valueOf(i), j
		});
		System.out.println(ns);
	}

	private static void work3()
	{
		String s = "asdDSfquGYdsFwq";
		char c = s.charAt(2);
		System.out.println(c);
		char ds[] = s.toCharArray();
		System.out.println(Arrays.toString(ds));
		boolean flag = s.endsWith("w1q");
		System.out.println(flag);
		flag = s.equalsIgnoreCase("as1dsfqugydsfwq");
		System.out.println(flag);
		byte bs[] = s.getBytes();
		System.out.println(Arrays.toString(bs));
		int i = s.indexOf("1sdD");
		System.out.println(i);
		i = s.lastIndexOf("wq");
		System.out.println(i);
		System.out.println(s.length());
		flag = s.startsWith("aas");
		System.out.println(flag);
		String ns = s.substring(0, 5);
		System.out.println(ns);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String str = "\t   a   a     ";
		System.out.println(str.trim());
		str = ".exe;.jpg;.html";
		String split[] = str.split(";");
		System.out.println(Arrays.toString(split));
	}

	private static void work2()
	{
		String s1 = "asd";
		String s2 = "asd";
		System.out.println(s1 == s2);
		String s3 = new String("asd");
		System.out.println(s1.equals(s3));
		String s4 = "asd";
		System.out.println(s1 == s4);
		String s5 = "a";
		String s6 = (new StringBuilder(String.valueOf(s5))).append("sd").toString();
		System.out.println(s1.equals(s6));
	}

	private static void work1()
	{
		String s = null;
		s.toString();
		s = "";
		s.toString();
	}
}
