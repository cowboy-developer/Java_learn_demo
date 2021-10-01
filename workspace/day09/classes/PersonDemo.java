// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PersonDemo.java

import java.io.PrintStream;

public class PersonDemo
{

	public PersonDemo()
	{
	}

	public static void main(String args[])
	{
		Gender gender = Gender.WOMAN;
		static class 1
		{

			static final int $SwitchMap$Gender[];

			static 
			{
				$SwitchMap$Gender = new int[Gender.values().length];
				try
				{
					$SwitchMap$Gender[Gender.MAN.ordinal()] = 1;
				}
				catch (NoSuchFieldError nosuchfielderror) { }
				try
				{
					$SwitchMap$Gender[Gender.WOMAN.ordinal()] = 2;
				}
				catch (NoSuchFieldError nosuchfielderror1) { }
			}
		}

		switch (1..SwitchMap.Gender[gender.ordinal()])
		{
		case 1: // '\001'
			System.out.println("man");
			break;

		case 2: // '\002'
			System.out.println("woman");
			break;
		}
	}
}
