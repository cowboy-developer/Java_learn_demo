package com.$520it_03;

//异常的抛出
public class ThrowDemo {
//	public static void main(String[] args) throws NumberFormatException {
	
	public static void main(String[] args) {
		//NumberFormatException的对象属于运行时期异常
		Integer.parseInt("");
		
	
		System.out.println("寻找客户");
		System.out.println("约谈细节");
		System.out.println("考虑比较");
		
		//派人签单
		//由于我调用了存在异常的方法,意思就是说执行这个方法可能出问题
		//1:可以使用try-catch,对可能产生的异常做处理
//		try {
//			work();
//		} catch (Exception e) {
//			System.out.println("不签拉倒");
//			return;
//		}
		//使用抛出异常的方式,一旦出现异常这个异常就往上抛出JVM
		//work();
		System.out.println("业务员回来公司");
		System.out.println("生产");
		System.out.println("交货");
	}
	
	//使用throws声明可能抛出异常的类型
	private static void work() throws Exception {
		System.out.println("业务员出门");
		System.out.println("达到客户公司");
		System.out.println("找领导签合同");
		//一下情况属于不正常情况
		//怎样告诉上面那个方法我这边出问题了
		//在Java中如果一个方法中的数据出现问题,必须抛出一个异常
		//使用throw抛出一个异常的对象
		System.out.println("货物不要了");
		System.out.println("签合同失败了");
		//反馈签单失败--->使用抛出异常对象
		//这里出现报错,不是代码有错,而是有异常,这个异常本身就是用来告诉调用我的方法知道的
		//这个异常就是属于不能处理的,此时必须在方法上声明有异常
		throw new Exception("客户签单失败!");
	}
}
