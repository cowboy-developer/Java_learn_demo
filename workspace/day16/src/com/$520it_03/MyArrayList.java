package com.$520it_03;

import java.util.Arrays;

public class MyArrayList {
	//增强底层数组的通用性
	private Object[] eles;
	//定义变量记录当前队伍有都是元素
	private int size;
	
//	1):默认需要安排多少队员上场。
	public MyArrayList() {
		//默认5个容量
		eles = new Object[5];
	}
	
//	2):把挑选好的队员存放到数组中。add
	public void add(Object ele) {
		//添加元素前进行元素的个数的判断
		if (size > eles.length - 1) {
//			自动扩容,创建一个更大的数组,把原来的元素拷贝到新的数组上
			eles = Arrays.copyOf(eles, eles.length + 5);
		}
		
		eles[size++] = ele;
	}
	
//	3):查询指定队员所在的位置。indexOf
	public int indexOf(Object ele) {
		if (ele == null) {
			throw new RuntimeException("传人的元素为null");
		}
		for (int i = 0; i < size; i++) {
			if (ele.equals(eles[i])) {
				return i;
			}
		}
		return -1;
	}
	
//	4):查询指定位置的队员是谁。get
	public Object get(int index) {
		//判断索引,如果有问题抛出异常
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		return eles[index];
	}
	
//	5):队员不幸战死，从战场上删除一名队员。remove
	public void remove(int index) {
		//判断索引,如果有问题抛出异常
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		if (index != size) {
			//删除不是最后一个
			for (int i = index; i < size; i++) {
				if (eles[i + 1] != null) {
					eles[i] = eles[i + 1];
				} else {
					eles[i] = null;
				}
			}
		} else {
			//删除最后一个
			eles[index] = null;
		}
		
		size--;
	}
	
//	6):队员不幸受伤，把指定位置的队员替换成另一名队员。set
	public void set(int index, Object ele) {
		//判断索引,如果有问题抛出异常
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		eles[index] = ele;
	}
	
//	7):返回战场上存活的队员人数。size
	public int size() {
		return size;
	}
	
//	8):打印出上场的所有队员。toString
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(eles[i]).append(",");
		}
		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}
	
	//判断是否有元素
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		eles = new Object[0];
		size = 0;
	}
}
