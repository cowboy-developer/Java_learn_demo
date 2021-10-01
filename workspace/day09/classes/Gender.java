// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PersonDemo.java

import java.io.PrintStream;

abstract class Gender extends Enum
	implements A
{

	public static final Gender MAN;
	public static final Gender WOMAN;
	private char gender;
	private static final Gender $VALUES[];

	public static Gender[] values()
	{
		return (Gender[])$VALUES.clone();
	}

	public static Gender valueOf(String s)
	{
		return (Gender)Enum.valueOf(Gender, s);
	}

	private Gender(String s, int i, char c)
	{
		super(s, i);
		gender = c;
	}

	public String toString()
	{
		return (new StringBuilder()).append(gender).append("").toString();
	}


	static 
	{
		MAN = new Gender("MAN", 0, '\u7537') {

			public void work()
			{
				System.out.println("nan ... wrok");
			}

		};
		WOMAN = new Gender("WOMAN", 1, '\u5973') {

			public void work()
			{
				System.out.println("woman ... wrok");
			}

		};
		$VALUES = (new Gender[] {
			MAN, WOMAN
		});
	}
}
