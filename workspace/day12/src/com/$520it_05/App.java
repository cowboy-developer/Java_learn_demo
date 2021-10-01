package com.$520it_05;

public class App {
	public static void main(String[] args) {
		String username = "admin";
		//注册功能
		resgist(username);
		
		//模拟注册成自动登录1次
		System.out.println("欢迎" + username);
	}
	
	public static void resgist(String username) {
		if ("admin".equals(username)) {
			//不让注册
//			System.out.println("注册失败");
			//应该使用异常来搞调用中这里失败了
			//由于这个异常是描述数字格式化错误的,不能表示注册异常
//			throw new NumberFormatException();
			//此时我们应该自定义异常
			throw new UsernameException("用户名已经存在");
		}
		
		System.out.println("注册成功");
	}
}
