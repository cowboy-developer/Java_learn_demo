package com.$520it_01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigMathDemo {
	public static void main(String[] args) {
		/*
		double num1 = 3.14;
		double num2 = 1000.000000000001;
		//double不能准确的表示小数,只能表示16位
		System.out.println(num1 * num2);
		*/
		//不能使用基本类型来做精度要求高的系统:比如银行
		
//		BigDecimal num1 = BigDecimal.valueOf(3.14);
//		BigDecimal num2 = BigDecimal.valueOf(1000.000000000000000000001);
//		BigDecimal num1 = new BigDecimal(3.14);
//		BigDecimal num2 = new BigDecimal(1000.000000000000000000001);
		BigDecimal num1 = new BigDecimal("3.14");
		BigDecimal num2 = new BigDecimal("1000.000000000001");
		System.out.println(num1.multiply(num2));
	}
	
//	计算100的阶乘
	public static void work() {
		//1*2*3*...*100
		BigInteger res = BigInteger.valueOf(1);
		for (int i = 2; i <= 100; i++) {
			//乘法运算应当调用对应的方法
			res = res.multiply(BigInteger.valueOf(i));
		}
		//为什么这里打印对象没有出现类名@哈希码?
		//底层重写了toString方法
		System.out.println(res);
		/*
		long res = 1;
		for (int i = 2; i <= 100; i++) {
			res *= i;
		}
		//思考:为什么结果是0,数据溢出,但由于基本类型范围限定过死
		System.out.println(res);
		*/
	}
}
