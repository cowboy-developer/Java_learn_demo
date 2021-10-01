package com.$520it_01;

public class Team {
	private Integer[] eles;
	//定义变量记录当前队伍有都是元素
	private int size;
	
//	1):默认需要安排多少队员上场。
	public Team() {
		//默认5个容量
		eles = new Integer[5];
	}
	
//	2):把挑选好的队员存放到数组中。add
	public void add(Integer ele) {
		eles[size++] = ele;
	}
	
//	3):查询指定队员所在的位置。indexOf
	public int indexOf(Integer ele) {
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
	public Integer get(int index) {
		return eles[index];
	}
	
//	5):队员不幸战死，从战场上删除一名队员。remove
	public void remove(int index) {
		eles[index] = null;
		size--;
	}
	
//	6):队员不幸受伤，把指定位置的队员替换成另一名队员。set
	public void set(int index, Integer ele) {
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
}
