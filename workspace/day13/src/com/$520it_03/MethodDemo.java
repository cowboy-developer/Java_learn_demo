package com.$520it_03;

public class MethodDemo {
	public static void main(String[] args) {
//		��ֻ̬�ܷ��ʾ�̬
		work();
		//Ϊʲômain���������η���public static
//		public��Ϊ�˱�֤�������κεط����ܵ���
//		staticΪ�˷���JVM����,ֱ����������
	}
	//�����Ľṹ-->����main����
//	[���η�] ����ֵ����(��������/��������) ������([�β��б�]) {������}
	/*
	 	���η������������η������� ����Ȩ�޵�
	 	����ֵ����ָ�ĵ��÷����󷵻ؽ����������,û�н��дvoid
	 	�β��б���ʵ���Ƕ���n������,��ɷ���ȱ�ٵ�δ֪���ض�����β�
	 	������:��������ķ���ֵ����void�򷽷�ִ�е����һ����������[return ����]
	 */
	public static void work() {
		System.out.println("...work hard");
	}
	public static void work(int i) {
		System.out.println("...work hard");
	}
	public static void work(String a, int i) {	}
	public static void work(int a, String i) {	}
}
