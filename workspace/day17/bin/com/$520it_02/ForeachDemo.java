// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ForeachDemo.java

package com.$520it_02;

import java.io.PrintStream;
import java.util.*;

public class ForeachDemo
{

	public ForeachDemo()
	{
	}

	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add("ÂÞ½ÜË¹");
		list.add("ÍÐÄá");
		list.add(Integer.valueOf(111));
		list.add("°Í»ù");
		Object obj;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(obj))
			obj = iterator.next();

	}
}
