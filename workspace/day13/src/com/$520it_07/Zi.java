package com.$520it_07;

public class Zi extends Fu {
	public static void get() {
		System.out.println("...zi static...");
	}
	
	public Zi() {
		//����Ĺ��췽����һ��Ĭ�ϲ���this()����super()
//		super();//���ø�����޲ι���
		//�������û���޲ι���,������ֶ����ø���Ĺ��췽��
		super(5);
	}
	
	public Zi(int i) {
		this();
		this.i = i;
	}
	
	int i = 10;
//	��д�����work����
	@Override
	public void work() {
		System.out.println("..Zi..");
	}
	
	public void sub() {
		System.out.println("...sb...");
	}
	
}
