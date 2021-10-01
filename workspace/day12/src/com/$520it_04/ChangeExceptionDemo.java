package com.$520it_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChangeExceptionDemo {
	public static void main(String[] args) {
		work();
	}
	
	//我们直接抛出了异常,导致别人调用我的代码也要抛
	private static void work() {
		//象征性创建一个资源
		try {
			//FileNotFoundException
			new FileInputStream("asdsda");//有编译时期异常
		} catch (FileNotFoundException e) {
			//这里是处理文件没有找到的异常
			//不能处理的异常
//			只要通过抛出异常,别人才能知道你这里出了问题
//  		我这方法使用try-catch的目的就是为了在方法上不抛异常
//			要达到方法上不抛异常,别人又要知道你这个有异常,必须对该异常进行转型
//			编译时期异常 --> 运行时期异常
			//如果直接使用一个新的异常,则原来的异常信息的断了
			//异常的转型必须保持异常信息的传递
			throw new RuntimeException(e);
		}
	} 
}
