package com.$520it_01;

public class ThrowableDemo {
	public static void main(String[] args) {
		//��ʾ�쳣
//		Throwable t = new Throwable();û���쳣��Ϣ,û������
		//ʹ���쳣��ԭ�򴴽�����
		Throwable t = new Throwable("���ñȽϳ�");
		//��ӡ�쳣ջ/�쳣ԭ��
		String msg = t.getMessage();//��ȡ�쳣��ԭ��
		System.out.println(msg);
		//��ӡ�쳣����ϸ��Ϣ
		t.printStackTrace();
	}
}
