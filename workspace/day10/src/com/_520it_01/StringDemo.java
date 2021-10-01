package com._520it_01;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		/*
		String str = "  \t  a \n ";
		boolean flag = Strings.isEntity(str);
		System.out.println(flag);
		*/
		switch ("a") {
			case "c":
				System.out.println("c");
				break;
			case "a":
				System.out.println("a");
			case "b":
				System.out.println("b");
		}
 	}

	private static void work4() {
		int i = 20;
		String j = "haha";
		//�ַ���ƴ�ӷ���
		String s = "i = " + i + ", j = " + j;
		System.out.println(s);
		//����1:Ҫ��ʽ�ַ���   ����2:�滻ֵ
		//ʹ��ռλ��   %s ��ʾ�ַ���    %d ��ʾ����
		String str = "i = %d, j = %s";
		String ns = String.format(str, i, j);
		System.out.println(ns);
	}

	private static void work3() {
		String s = "asdDSfquGYdsFwq";
//		charAt����     ����ָ���������ַ�
		char c = s.charAt(2);
		System.out.println(c);
//		toCharArray����    ת����ַ�����
		char[] ds = s.toCharArray();
		System.out.println(Arrays.toString(ds));
//		endsWith����     �ж��Ƿ���...��β
		boolean flag = s.endsWith("w1q");
		System.out.println(flag);
		
//		equalsIgnoreCase����     ��equals�Ļ����Ϻ��Դ�Сд
		flag =  s.equalsIgnoreCase("as1dsfqugydsfwq");
		System.out.println(flag);
//		getBytes����     ������ ת���byte[]
		byte[] bs = s.getBytes();
		System.out.println(Arrays.toString(bs));
//		indexOf����      ĳ�ַ���һ�γ��ֵ�����
		int i = s.indexOf("1sdD");
		System.out.println(i);
//		lastIndexOf����     ĳ�ַ����һ�γ��ֵ�����
		i = s.lastIndexOf("wq");
		System.out.println(i);
		
//		length����      �����ַ����ĳ���
		System.out.println(s.length());
//		startsWith����     �ж��Ƿ���...��ͷ
		flag = s.startsWith("aas");
		System.out.println(flag);
//		substring����       ��ȡ�ַ��� [s,e)������e����
		String ns = s.substring(0, 5);
		System.out.println(ns);
		
//		toLowerCase����       תСд
		System.out.println(s.toLowerCase());
//		toUpperCase����       ת��д
		System.out.println(s.toUpperCase());
//		trim����       ȥ����β���еĿհ��ַ�,�м�Ŀո����
		String str = "\t   a   a     ";
		System.out.println(str.trim());
//		split����	   �и��ַ���
		str = ".exe;.jpg;.html";
		String[] split = str.split(";");
		System.out.println(Arrays.toString(split));
	}

	private static void work2() {
		//�ж��ַ��������Ƿ���ͬ(ͬһ������)
		String s1 = "asd";
		String s2 = "asd";
		System.out.println(s1 == s2);//true
		
		String s3 = new String("asd");
		//System.out.println(s1 == s3);//false
		//Ӧ��ʹ��equals
		System.out.println(s1.equals(s3));
		
		String s4 = "as" + "d";
		System.out.println(s1 == s4);//true
		
		String s5 = "a";
		String s6 = s5 + "sd";
		//System.out.println(s1 == s6);//false
		System.out.println(s1.equals(s6));
		
		/*//���״�������������
		String s1 = "asd";//��������д���,�����򴴽�1������
		//���ϵ�asd�ĸ���
		//-------------
		//��������������:��һ���ǳ����ص�asd
		//			�ڶ����Ƕ��ϵ�asd�ĸ���
		String s3 = new String("asd");*/
	}

	private static void work1() {
		/*
		//��������
		//������ʽ
		String s = "abc";
		//ʹ�ù��췽���ķ�ʽ
		//���ݱ������ַ�ת����ַ���,������byte[]����ʽ
		s = new String(new byte[] {97, 98, 99});
		System.out.println(s);
		
		//��ʵ�ײ���ǰ��ҵ����鿽����һ�ݸ��ײ�ĳ�������
		s = new String(new char[] {'a', 'b', 'c'});
		System.out.println(s);
		
		s = new String("abc");
		System.out.println(s);
		*/
		
		//�ַ����Ŀ�ֵ����
		//��ʾs����û�б����ַ,û�ж���
		String s = null;
		//���ַ�ʽ�ǲ��ܵ��ó�Ա��,���õĽ�����ǿ�ָ���쳣
		s.toString();
		//�����ʾ���������õ�ַ,�ж���,ֻ�����������ײ������û������
		s = "";// char[0]
		//�����ǿ��Ե��ö���ĳ�Ա��
		s.toString();
	}
}
