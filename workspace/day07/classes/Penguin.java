// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OverrideDemo.java

import java.io.PrintStream;

class Penguin extends Bird
{

	Penguin()
	{
	}

	public void fly()
	{
		System.out.println("˦�˼��³���ַɲ�����");
		super.fly();
	}
}
