package com._520it_02;

public class StringBuilderDemo {
	public static void main(String[] args) {
		//创建对象
		//无参构造默认16个长度
		StringBuilder sb = new StringBuilder();
		//添加内容
		//链式编程,底层肯定是return this
		sb.append("123").append(11);
		System.out.println(sb.toString());
		sb.append("aaa");
		System.out.println(sb);//12311aaa
		//根据索引删除内容
		sb.delete(0, 3);//[0,3)
		//删除指定索引的内容
		//sb.deleteCharAt(1);
		System.out.println(sb);//11aaa
		sb.insert(1, "abc");
		System.out.println(sb);
	}
}
