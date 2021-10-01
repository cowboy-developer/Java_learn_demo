package com._520it_01;

//字符串的工具类
public class Strings {
	private Strings() {}
	/**
	 * 判断字符串是否为空
	 * @param str 要判断字符串
	 * @return true 空
	 */
	public static boolean isEntity(String str){
		//只要内容是null或者全空白 返回true
		//处理null必须放在第一位
		if (str == null) {
			return true;			
		}
		//去除首尾的所有空格
		str = str.trim();
		if (str.length() > 0) {//有内容
			return false;
		} 
		
		return true;
	}

}
