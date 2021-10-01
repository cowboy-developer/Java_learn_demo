package com.$520it_02;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("罗杰斯");
		list.add("托尼");
		list.add(111);
		list.add("巴基");
		
		//使用foreach进行迭代
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
