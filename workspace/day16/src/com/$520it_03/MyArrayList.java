package com.$520it_03;

import java.util.Arrays;

public class MyArrayList {
	//��ǿ�ײ������ͨ����
	private Object[] eles;
	//���������¼��ǰ�����ж���Ԫ��
	private int size;
	
//	1):Ĭ����Ҫ���Ŷ��ٶ�Ա�ϳ���
	public MyArrayList() {
		//Ĭ��5������
		eles = new Object[5];
	}
	
//	2):����ѡ�õĶ�Ա��ŵ������С�add
	public void add(Object ele) {
		//���Ԫ��ǰ����Ԫ�صĸ������ж�
		if (size > eles.length - 1) {
//			�Զ�����,����һ�����������,��ԭ����Ԫ�ؿ������µ�������
			eles = Arrays.copyOf(eles, eles.length + 5);
		}
		
		eles[size++] = ele;
	}
	
//	3):��ѯָ����Ա���ڵ�λ�á�indexOf
	public int indexOf(Object ele) {
		if (ele == null) {
			throw new RuntimeException("���˵�Ԫ��Ϊnull");
		}
		for (int i = 0; i < size; i++) {
			if (ele.equals(eles[i])) {
				return i;
			}
		}
		return -1;
	}
	
//	4):��ѯָ��λ�õĶ�Ա��˭��get
	public Object get(int index) {
		//�ж�����,����������׳��쳣
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		return eles[index];
	}
	
//	5):��Ա����ս������ս����ɾ��һ����Ա��remove
	public void remove(int index) {
		//�ж�����,����������׳��쳣
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		if (index != size) {
			//ɾ���������һ��
			for (int i = index; i < size; i++) {
				if (eles[i + 1] != null) {
					eles[i] = eles[i + 1];
				} else {
					eles[i] = null;
				}
			}
		} else {
			//ɾ�����һ��
			eles[index] = null;
		}
		
		size--;
	}
	
//	6):��Ա�������ˣ���ָ��λ�õĶ�Ա�滻����һ����Ա��set
	public void set(int index, Object ele) {
		//�ж�����,����������׳��쳣
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		eles[index] = ele;
	}
	
//	7):����ս���ϴ��Ķ�Ա������size
	public int size() {
		return size;
	}
	
//	8):��ӡ���ϳ������ж�Ա��toString
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
	
	//�ж��Ƿ���Ԫ��
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		eles = new Object[0];
		size = 0;
	}
}
