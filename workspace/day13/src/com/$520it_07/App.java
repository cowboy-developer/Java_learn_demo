package com.$520it_07;

public class App {
	public static void main(String[] args) {
		//��̬
		//���˼̳к�����Ҳ������ĸ���
		Fu f = new Zi();
		//��Ա���õĺ���
		//����-->ȥFu���ұ���i
		System.out.println(f.i);
		//����-->���е���Zi�����Fu�ռ�i
		
		//���ǵ��÷�����һ��
		f.work();
		//��̬��������õķ�����������д,���ó�����������ķ���
		//��ʱ�ǲ��ܵ��õ���������з���
		//����ʱֻ��ȥ����������(Fu)����sub����
//		f.sub();�Ҳ�������
		
		Zi z = new Zi();
		z.sub();
		//��̬��ʹ����������
		f.get();//-->Fu.get()
		z.get();//-->Zi.get()
		
		//һ�������Zi��û��get�ľ�̬����
		z.get();//-->Fu.get()
	}
}
