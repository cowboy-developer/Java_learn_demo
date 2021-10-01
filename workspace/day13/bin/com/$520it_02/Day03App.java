// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Day03App.java

package com.$520it_02;

import java.io.PrintStream;

public class Day03App
{

	public Day03App()
	{
	}

	public static void main(String args[])
	{
		String s = "a";
		String s1;
		switch ((s1 = s).hashCode())
		{
		default:
			break;

		case 97: // 'a'
			if (s1.equals("a"))
				System.out.println('a');
			break;
		}
	}
}
