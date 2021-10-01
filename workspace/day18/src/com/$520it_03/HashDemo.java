package com.$520it_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("罗杰斯", "美国队长");
		map.put("索尔", "雷神");
		map.put("托尼", "钢铁侠");
		
		//获取map的所有映射关系
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.format("key=%s,value=%s\n", key, value);
		}
		
		/*//通过拿到所有key
		Set<String> keys = map.keySet();
		for (String s : keys) {
			//通过key获取value
			String val = map.get(s);
			System.out.format("%s=%s\n", s, val);
		}
		
		//直接获取所有的value
		Collection<String> vals = map.values();
		for (String s : vals) {
			System.out.println(s);
		}*/
	}

	private static void work() {
		/*//先演示哈希表
		Hashtable<String, String> table = new Hashtable<>();
		
		table.put("罗杰斯", "美国队长");
		table.put("托尼", "钢铁侠");
		
		//table里面有几个元素?这里指的是有都是映射关系
		System.out.println(table.size());
		//key=value {托尼=钢铁侠, 罗杰斯=美国队长}
		System.out.println(table);*/
		
		Map<String, String> map = new HashMap<>();
		map.put("罗杰斯", "美国队长");
		map.put("逍遥", "美国队长");
		map.put("托尼", "钢铁侠");
		
		/*
		//map里面有多少映射关系
		System.out.println(map.size());
		//key=value {托尼=钢铁侠, 罗杰斯=美国队长}
//		System.out.println(map);
		//我想知道托尼的角色名称 -->根据key->value
		//根据key去Map中找value
		String value = map.get("索尔");
		System.out.println(value);
		boolean b = map.containsKey("索尔");
		System.out.println(b);
		//删除罗杰斯
		//根据key删除映射关系
		map.remove("罗杰斯");
		 */
		//如key存在,则替换操作
//		map.put("罗杰斯", "中国队长");
		System.out.println(map);
	}
}
