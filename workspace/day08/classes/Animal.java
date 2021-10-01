// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InitCodeDemo.java

import java.io.PrintStream;

class Animal
{

	int i;

	Animal()
	{
		i = 10;
		System.out.println("init");
		System.out.println("Object");
	}

	public static void work()
	{
		System.out.println("fu");
	}

	public void eat()
	{
		System.out.println("³Ô²Ý");
	}
}
