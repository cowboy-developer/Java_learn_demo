package com;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		//统计一个字符串中每个字符出现的次数
		//如:aabccc  -> a=2 b=1 c=3
		//从控制台获取数据,只能在cmd中使用
		Console console = System.console();
//		String s = console.readLine();
		char[] ds = console.readPassword();
		
		//Map 字符key 次数value
		char[] cs = ds;
		
		Map<Character, Integer> map = new HashMap<>();
		//key存在->value+1  key不存在 value=1
		for (char c : cs) {
			if (map.containsKey(c)) {
				//存在
				Integer num = map.get(c);
				map.put(c, num + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}
}
