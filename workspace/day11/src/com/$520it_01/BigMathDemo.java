package com.$520it_01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigMathDemo {
	public static void main(String[] args) {
		/*
		double num1 = 3.14;
		double num2 = 1000.000000000001;
		//double����׼ȷ�ı�ʾС��,ֻ�ܱ�ʾ16λ
		System.out.println(num1 * num2);
		*/
		//����ʹ�û���������������Ҫ��ߵ�ϵͳ:��������
		
//		BigDecimal num1 = BigDecimal.valueOf(3.14);
//		BigDecimal num2 = BigDecimal.valueOf(1000.000000000000000000001);
//		BigDecimal num1 = new BigDecimal(3.14);
//		BigDecimal num2 = new BigDecimal(1000.000000000000000000001);
		BigDecimal num1 = new BigDecimal("3.14");
		BigDecimal num2 = new BigDecimal("1000.000000000001");
		System.out.println(num1.multiply(num2));
	}
	
//	����100�Ľ׳�
	public static void work() {
		//1*2*3*...*100
		BigInteger res = BigInteger.valueOf(1);
		for (int i = 2; i <= 100; i++) {
			//�˷�����Ӧ�����ö�Ӧ�ķ���
			res = res.multiply(BigInteger.valueOf(i));
		}
		//Ϊʲô�����ӡ����û�г�������@��ϣ��?
		//�ײ���д��toString����
		System.out.println(res);
		/*
		long res = 1;
		for (int i = 2; i <= 100; i++) {
			res *= i;
		}
		//˼��:Ϊʲô�����0,�������,�����ڻ������ͷ�Χ�޶�����
		System.out.println(res);
		*/
	}
}
