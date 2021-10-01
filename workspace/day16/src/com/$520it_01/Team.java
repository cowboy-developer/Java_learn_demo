package com.$520it_01;

public class Team {
	private Integer[] eles;
	//���������¼��ǰ�����ж���Ԫ��
	private int size;
	
//	1):Ĭ����Ҫ���Ŷ��ٶ�Ա�ϳ���
	public Team() {
		//Ĭ��5������
		eles = new Integer[5];
	}
	
//	2):����ѡ�õĶ�Ա��ŵ������С�add
	public void add(Integer ele) {
		eles[size++] = ele;
	}
	
//	3):��ѯָ����Ա���ڵ�λ�á�indexOf
	public int indexOf(Integer ele) {
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
	public Integer get(int index) {
		return eles[index];
	}
	
//	5):��Ա����ս������ս����ɾ��һ����Ա��remove
	public void remove(int index) {
		eles[index] = null;
		size--;
	}
	
//	6):��Ա�������ˣ���ָ��λ�õĶ�Ա�滻����һ����Ա��set
	public void set(int index, Integer ele) {
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
}
