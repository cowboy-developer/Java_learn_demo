/*
	�������Ƕ��ʹ��Arrays�һ�Ҫ���ϵ�ǿ������
	�ܷ�,��
	�����������
*/
//package com._520it;//��������λ�����ĵĵ�һ��
//��Ҫֱ��ʹ��������Ҫʹ�õ������
//�﷨:import ����.����;

//import java.util.Arrays;//���ø��߱�����ȥ������
//�京����������ʹ�õ�ArraysҪȥjava.util.Arrays
//�������������������ĵ�һ�л��߰���������,����������֮ǰ
//import java.util.ArrayList;
/*
	�������µ��඼��java.util��
	�ܲ��ܸ��߱�����ȥjava.util�а�����������
*/
import java.util.*;//��ʾ���µ���ȥjava.util����
//���Լ򵥵���⵼������������е���
//��̬���� ������������Ǿ�̬�ĳ�Ա
//import static java.lang.Math.PI;//���뾲̬���ֶ�
import static java.util.Arrays.sort;
import static java.lang.Math.*;

public class ImportDemo {
	public static void main(String[] args)	{
		//��ʾ����
		int[] arr = new int[] {3,2,1};
		//������������а���,��Щд��ʾ���Ƿ��ʲ���������Arrays
		//Arrays.sort(arr);  //ϵͳ�в�����
		//java.util.Arrays.sort(arr);
		sort(arr);
		System.out.println(Arrays.toString(arr));
		//����ʡ��n��ʹ�ù�����
		ArrayList list = null;

		//����Ҫʹ��Բ����
		//ʹ�þ�̬��������ֱ��ʹ�þ�̬��Ա
		//System.out.println(Math.PI);
		System.out.println(PI);//��ʱ�����ڱ�������PI
		System.out.println(E);
	}
}
