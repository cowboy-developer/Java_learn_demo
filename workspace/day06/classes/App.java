// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   App.java

import java.io.PrintStream;

public class App
{

	public App()
	{
	}

	public static void main(String args[])
	{
		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		student.name = "王尼玛";
		student1.name = "任真天";
		student2.name = "易小星";
		student.fees();
		Student astudent[] = {
			student, student1, student2
		};
		Student astudent1[] = astudent;
		int i = astudent1.length;
		for (int j = 0; j < i; j++)
		{
			Student student3 = astudent1[j];
			System.out.println((new StringBuilder()).append(student3.name).append(":").append(student3.fee).toString());
		}

		astudent1 = astudent;
		i = astudent1.length;
		for (int k = 0; k < i; k++)
		{
			Student student4 = astudent1[k];
			if (!student4.fee)
				student4.fees();
		}

		astudent1 = astudent;
		i = astudent1.length;
		for (int l = 0; l < i; l++)
		{
			Student student5 = astudent1[l];
			System.out.println((new StringBuilder()).append(student5.name).append(":").append(student5.fee).toString());
		}

	}
}
