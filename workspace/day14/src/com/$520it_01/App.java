package com.$520it_01;

public class App {
	public static void main(String[] args) throws Exception {
		//使用Java程序开启进程  xxx.exe
		//使用正在运行的Java程序开启线程
		Runtime runtime = Runtime.getRuntime();
		//调用方法执行命令开启进程
		Process exec = runtime.exec("notepad");
		System.out.println("使用完毕,杀掉进程");
		//销毁进程
		exec.destroy();
	}
}
