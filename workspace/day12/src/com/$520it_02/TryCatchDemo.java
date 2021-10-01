package com.$520it_02;

public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("start");
		//模拟计算机
		String sNum1 = "2a0";
		String sNum2 = "0";
		
		//这个方法有可能抛出NumberFormatException异常
		Integer.parseInt(sNum1);
		
		int iNum1 = 0;
		int iNum2 = 0;
		
		try {
			//对获取到的值进行转换再做运算
			iNum1 = Integer.parseInt(sNum1);
			iNum2 = Integer.parseInt(sNum2);
		
			System.out.println(iNum1 / iNum2);
			//我们查看文档发现所有以Exception结尾的都是Exception的子类
		} catch (Exception e) {
			//如果异常不需要精细化处理时可以直接捕获他们的父类型
			//但是如果要精细化处理,则必须分别捕获每一个异常
			System.err.println(e.getMessage());
			System.out.println("异常处理了");
		}
		/*
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			//说明发生算术异常
			System.out.println(iNum1 / 1);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			//象征性处理
			iNum1 = Integer.parseInt("10");
			iNum2 = Integer.parseInt("1");
			System.out.println(iNum1 / iNum2);
		} 

		try {
			//对获取到的值进行转换再做运算
			iNum1 = Integer.parseInt(sNum1);
			iNum2 = Integer.parseInt(sNum2);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			//象征性处理
			iNum1 = Integer.parseInt("10");
			iNum2 = Integer.parseInt("1");
		}
		
		try {
			System.out.println(iNum1 / iNum2);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			//说明发生算术异常
			System.out.println(iNum1 / 1);
		}
		*/
		
		System.out.println("end");
	}
	/*
	  try {
	  	可能出现异常的代码
	  } catch (可能发生的异常变量) {
	  	处理异常的代码
	  	(一般来讲异常都是由于用户使用不当,绝大部分异常我们都是不能处理)
	  	只能象征性处理
	  }
	 */

	private static void work1() {
		System.out.println("start");
		//核心  代码正常的情况
//		int num = 10 / 2;
		int num = 0;
		try {
			num = 10 / 0;//发生异常
			System.out.println(num);
		} catch (ArithmeticException e) {
			num = 10/1;//象征性处理
			System.out.println(num);
		}
		
		System.out.println("end");
	}
}
