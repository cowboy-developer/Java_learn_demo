package com.$520it_02;

import java.util.Date;
import java.util.Iterator;

public class MyIter implements Iterable {
	
	//׼��һЩ����
	private Object[] eles = {"1111",2,new Date()};

	@Override
	public Iterator iterator() {
		return new Iterator() {
			private int index; 
			
			@Override
			public boolean hasNext() {
				return index != eles.length;
			}

			@Override
			public Object next() {
				return eles[index++];
			}

			@Override
			public void remove() {}
		};
	}
	
	public static void main(String[] args) {
		MyIter iter = new MyIter();
		for (Object obj : iter) {
			//��������:������ȡ��Ԫ�غ����ǲ��ܵ��õ�Դ��������з���
//			System.out.println(obj);
			//��Ҫ����String�����length()
			String s = (String) obj;
			System.out.println(s.length());
		}
	}

}
