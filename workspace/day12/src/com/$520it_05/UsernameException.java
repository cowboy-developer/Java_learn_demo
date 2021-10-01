package com.$520it_05;
/**
 * 用于描述注册时用户名已经存在的异常
 */
public class UsernameException extends RuntimeException {

	//必须要有以下构造方法
	//来用封装异常的信息
	public UsernameException(String message) {
		super(message);
	}
	//这个构造方法可以用于异常的转换
	public UsernameException(Throwable cause) {
		super(cause);
	}
}
