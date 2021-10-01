package com.$520it_01;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		//删除文件
		File file = new File("1.txt");
		//马上删除路径
//		System.out.println(file.delete());
		//在JVM退出的时候删除,一般用于删除临时文件
		file.deleteOnExit();
		
		System.out.println("删除完毕");
	}

	private static void work4() {
		//获取文件的属性信息
		File file = new File("c:/setup.exe");
		//获取文件的大小
		System.out.println(file.length());
		//获取文件的绝对路径
		//所谓绝对路径就是从盘符开始的具体的地址
//		System.out.println(file.getAbsolutePath());
		//获取相对路径
//		System.out.println(file.getName());
		System.out.println(file.canExecute());
	}

	private static void work3() {
		//文件的相关判断
		File file = new File("c:/1");
		//判断文件是否存在
//		boolean b = file.exists();
		//以下判断反true都是路径存在的前提,路径不存在返回false
		//判断这个路径是文件还是文件呢
		boolean b = file.isFile();
		//判断是否文件夹
//		boolean b = file.isDirectory();
		System.out.println(b);
	}

	private static void work2() {
		//使用Java来创建文件
		File file = new File("c:/1/1.txt");
//		创建文件夹
		//返回是是否创建成功
		//只能创建1个,并且必须父路径存在
//		boolean b = file.mkdir();
		//可以创建多级路径
//		boolean b = file.mkdirs();
		
		//必须父路径存在才能使用,创建文件
//		boolean b = file.createNewFile();
//		System.out.println(b);
		
		//把file重命名 cjk.avi
		file.renameTo(new File("c:/1/cjk.avi"));
	}

	private static void work1() {
		//构造方法
		//参数是文件/文件夹的路径名称
//		String path = "C:\\Intel\\Logs";
		String path = "C:/Intel";
		//File其实就是对String做一个包装描述成硬盘上的文件
		File file = new File(path);
		//底层重写的toString方法,传值的时候把'/'变成'\'
		System.out.println(file);
		//参数1:表示父路径   参数2:表示子路径
		//以后安卓用的
//		File file2 = new File(file, "Logs");
		File file2 = new File(path, "Logs");
		System.out.println(file2);
	}
}
