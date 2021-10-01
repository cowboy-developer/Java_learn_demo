// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   App.java

import java.io.PrintStream;

class Student
{

	String name;
	boolean fee;

	Student()
	{
	}

	public void fees()
	{
		fee = true;
		System.out.println((new StringBuilder()).append(name).append("½»·Ñ").toString());
	}
}
