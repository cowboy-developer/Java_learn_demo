package com.$520it_05;

public class OOPApp {
	public static void main(String[] args) {
		/*//��ӡ��һ���˵���Ϣ name age gender ...
//		String name = "������";
//		int age = 26;
//		char gender = '��';
//		System.out.println("������:" + name + " ...");
//		name = "������";
//		age = 30;
//		gender = '��';
//		System.out.println("������:" + name + " ...");
		//����Person��(ģ��),����һ��Person����
		Person p = new Person();//0xa
		//��������ĳ�Ա  ����
//		��ֵ       ���� = ����
		p.name = "������";//˵��name����p����
//		��ȡֵ      ʹ�ñ�����
		System.out.println(p.name);//˵��name����p����
		
		p.age = 26;
		System.out.println(p.age);
		//��װ�ֶε���,ͨ�����������������ֶ�
		p = null;//0xa�ϵĶ��������������
*/	
		//��ʾʹ���޲ι�������ʼ������
//		Person p = new Person();//Person����û���޲ι���
		//ͨ�����˲��������вι���
		Person p = new Person("������");
		p.i = 10;// ---> Person.i = 10;
	}
}

//���ݶ�����������������
class Person {
	//���췽��
//	û��д��һ��Ĭ�ϵĹ��췽��
	Person() {}
//	����Լ�д�˹��췽����û��Ĭ�ϵ���
	Person(String name) {
		this.name = name;
	}
	
	static int i;
	
	String name;
	int age;
	char gender;
	
	public void show() {
		System.out.println("...show...");
	}

	public void makeMoney() {
		System.out.println("...in money...");
	}
}
