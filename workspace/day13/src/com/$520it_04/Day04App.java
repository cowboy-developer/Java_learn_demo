package com.$520it_04;

public class Day04App {
	public static void main(String[] args) {
		//����ĳ�ʼ��
		//����[] ��ʾһά����
//		int[] arr = {1,2};//��̬��ʼ��
//		int[] arr = new int[]{1,2};//��̬��ʼ��
//		arr = {1,2,3};��д�ķ�ʽֻ�����ڶ������ϳ�ʼ��
		
		//��̬�����Ǹ�����ĳ���
		//����һ��int������10������
		int[] arr = new int[10];
		//��arr�ĵ�2��������ֵ
		//��ֵ :  ������  = ����
		arr[1] = 5;
		//����ֵ     ֱ�ӷ��ʱ�����
		System.out.println(arr[1]);
		/*
		//Ҫ����Ҫ�����Ԫ��,����֪������ĳ���
		//��ȡ����ĳ���     �������.length
		System.out.println(arr.length);
		System.out.println("----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		for (int i : arr) {
			System.out.println(i);
		}
		*/
		arr = null;
//		NullPointerException����û�е�ַ���������Ա
		arr.toString();
		//ArrayIndexOutOfBoundsException�����˲����ڵ�����
		arr[-1] = 10;
	}
}
