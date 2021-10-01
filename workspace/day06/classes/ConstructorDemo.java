// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConstructorDemo.java

import java.io.PrintStream;

public class ConstructorDemo
{

	public ConstructorDemo()
	{
	}

	public static void main(String args[])
	{
		Person person = new Person();
		person.name = "Ò×Ğ¡ĞÇ";
		person.age = 1;
		System.out.println((new StringBuilder()).append(person.name).append(":").append(person.age).toString());
		Person person1 = new Person("ÍõÄáÂê");
		System.out.println((new StringBuilder()).append(person1.name).append(":").append(person1.age).toString());
		Person person2 = new Person("ÕÔÌúÖù", 30);
		System.out.println((new StringBuilder()).append(person.name).append(":").append(person.age).toString());
		System.out.println(person1.name);
		Person.lvUp();
		Person.lvUp();
		Person  = person;
		Person 1 = person1;
		Person 2 = person2;
		System.out.println((new StringBuilder()).append(Person.civilized).append(":").append(Person.civilized).append(":").append(Person.civilized).toString());
		Person person3 = new Person("ÍõÄáÃÃ", 0);
		Person 3 = person3;
		System.out.println((new StringBuilder()).append(person3.name).append(":").append(Person.civilized).toString());
	}
}
