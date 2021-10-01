/*
	由于我们多次使用Arrays我还要不断的强调包名
	很烦,蠢
	发明导包语句
*/
//package com._520it;//包语句必须位于正文的第一行
//想要直接使用类名就要使用导包语句
//语法:import 包名.类名;

//import java.util.Arrays;//作用告诉编译器去哪找类
//其含义是下面所使用的Arrays要去java.util.Arrays
//导包语句必须声明在正文第一行或者包语句的下面,声明类的语句之前
//import java.util.ArrayList;
/*
	由于以下的类都在java.util中
	能不能告诉编译器去java.util中挨个挨个找呢
*/
import java.util.*;//表示以下的类去java.util下找
//可以简单的理解导入这个包下所有的类
//静态导入 后面所导入的是静态的成员
//import static java.lang.Math.PI;//导入静态的字段
import static java.util.Arrays.sort;
import static java.lang.Math.*;

public class ImportDemo {
	public static void main(String[] args)	{
		//演示导包
		int[] arr = new int[] {3,2,1};
		//由于这个类是有包名,这些写表示的是访问不带包名的Arrays
		//Arrays.sort(arr);  //系统中不存在
		//java.util.Arrays.sort(arr);
		sort(arr);
		System.out.println(Arrays.toString(arr));
		//后面省略n出使用工具类
		ArrayList list = null;

		//我想要使用圆周率
		//使用静态导入后可以直接使用静态成员
		//System.out.println(Math.PI);
		System.out.println(PI);//此时含义在本类中找PI
		System.out.println(E);
	}
}
