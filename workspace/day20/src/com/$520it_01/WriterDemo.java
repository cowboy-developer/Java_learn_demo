package com.$520it_01;

import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) throws Exception {
		//д�ַ�����
		Writer writer = new FileWriter("c:/1.txt");
		//д����
		write(writer);
		//�ر���Դʱ���Զ�ˢ��1��
		//����������Ҳ���Զ�ˢ��
		writer.close();
	}

	private static void write(Writer writer) throws Exception {
		//д����
		writer.write("���Ǵ�ħ��");
		//�ַ�����д��д��ײ�Ļ�����,Ҫ������д���ļ��ϻ���Ҫˢ�»�����
		//ˢ�»�����
//		writer.flush();
	}
}
