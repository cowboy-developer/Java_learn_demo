// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GenericTypeDemo.java

package com.$520it_03;

import java.io.PrintStream;
import java.util.*;

public class GenericTypeDemo
{

	public GenericTypeDemo()
	{
	}

	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add("123");
		list.add("haha");
		list.add("hehe");
		list.add("ºÚ¹Ñ¸¾");
		System.out.println(list);
		System.out.println(((String)list.get(0)).length());
		String s;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s.length()))
			s = (String)iterator.next();

	}
}
