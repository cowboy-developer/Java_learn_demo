package com.$520it_06;

public class Zi extends Fu {
	public Zi() {
		//����Ĺ��췽����һ��Ĭ�ϲ���this()����super()
//		super();//���ø�����޲ι���
		//�������û���޲ι���,������ֶ����ø���Ĺ��췽��
		super(1);
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
		//���ñ����صķ���  ..Fu..
		//���õ�ǰ��ĸ����work����
		super.work();
		//ȥZi�ĸ�����ȥwork����
		//super��ʾ���ǵ�ǰ��ĸ�����
		System.out.println(super.i);
	}
}
