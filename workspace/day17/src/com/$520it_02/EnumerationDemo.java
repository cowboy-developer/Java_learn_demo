package com.$520it_02;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		//�����Iterator
		Vector v = new Vector();
		v.addElement("1");
		v.addElement(100);
		v.addElement(new Date());
		
//		ʹ�ù��ϵĵ�����
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
