package com._520it_02;

public class StringBuilderDemo {
	public static void main(String[] args) {
		//��������
		//�޲ι���Ĭ��16������
		StringBuilder sb = new StringBuilder();
		//�������
		//��ʽ���,�ײ�϶���return this
		sb.append("123").append(11);
		System.out.println(sb.toString());
		sb.append("aaa");
		System.out.println(sb);//12311aaa
		//��������ɾ������
		sb.delete(0, 3);//[0,3)
		//ɾ��ָ������������
		//sb.deleteCharAt(1);
		System.out.println(sb);//11aaa
		sb.insert(1, "abc");
		System.out.println(sb);
	}
}
