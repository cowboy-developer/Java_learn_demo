package com.$520it_02;

public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("start");
		//ģ������
		String sNum1 = "2a0";
		String sNum2 = "0";
		
		//��������п����׳�NumberFormatException�쳣
		Integer.parseInt(sNum1);
		
		int iNum1 = 0;
		int iNum2 = 0;
		
		try {
			//�Ի�ȡ����ֵ����ת����������
			iNum1 = Integer.parseInt(sNum1);
			iNum2 = Integer.parseInt(sNum2);
		
			System.out.println(iNum1 / iNum2);
			//���ǲ鿴�ĵ�����������Exception��β�Ķ���Exception������
		} catch (Exception e) {
			//����쳣����Ҫ��ϸ������ʱ����ֱ�Ӳ������ǵĸ�����
			//�������Ҫ��ϸ������,�����ֱ𲶻�ÿһ���쳣
			System.err.println(e.getMessage());
			System.out.println("�쳣������");
		}
		/*
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			//˵�����������쳣
			System.out.println(iNum1 / 1);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			//�����Դ���
			iNum1 = Integer.parseInt("10");
			iNum2 = Integer.parseInt("1");
			System.out.println(iNum1 / iNum2);
		} 

		try {
			//�Ի�ȡ����ֵ����ת����������
			iNum1 = Integer.parseInt(sNum1);
			iNum2 = Integer.parseInt(sNum2);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			//�����Դ���
			iNum1 = Integer.parseInt("10");
			iNum2 = Integer.parseInt("1");
		}
		
		try {
			System.out.println(iNum1 / iNum2);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			//˵�����������쳣
			System.out.println(iNum1 / 1);
		}
		*/
		
		System.out.println("end");
	}
	/*
	  try {
	  	���ܳ����쳣�Ĵ���
	  } catch (���ܷ������쳣����) {
	  	�����쳣�Ĵ���
	  	(һ�������쳣���������û�ʹ�ò���,���󲿷��쳣���Ƕ��ǲ��ܴ���)
	  	ֻ�������Դ���
	  }
	 */

	private static void work1() {
		System.out.println("start");
		//����  �������������
//		int num = 10 / 2;
		int num = 0;
		try {
			num = 10 / 0;//�����쳣
			System.out.println(num);
		} catch (ArithmeticException e) {
			num = 10/1;//�����Դ���
			System.out.println(num);
		}
		
		System.out.println("end");
	}
}
