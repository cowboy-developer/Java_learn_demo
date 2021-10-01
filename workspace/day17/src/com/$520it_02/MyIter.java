package com.$520it_02;

import java.util.Date;
import java.util.Iterator;

public class MyIter implements Iterable {
	
	//准备一些数据
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
			//存在问题:我们先取出元素后我们不能调用到源对象的特有方法
//			System.out.println(obj);
			//我要调用String对象的length()
			String s = (String) obj;
			System.out.println(s.length());
		}
	}

}
