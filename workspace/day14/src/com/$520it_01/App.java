package com.$520it_01;

public class App {
	public static void main(String[] args) throws Exception {
		//ʹ��Java����������  xxx.exe
		//ʹ���������е�Java�������߳�
		Runtime runtime = Runtime.getRuntime();
		//���÷���ִ�����������
		Process exec = runtime.exec("notepad");
		System.out.println("ʹ�����,ɱ������");
		//���ٽ���
		exec.destroy();
	}
}
