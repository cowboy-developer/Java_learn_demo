package com.$520it_03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//1:获取对象
		Calendar c = Calendar.getInstance();
		/*work(c);
		
		//3设置当前的日期
		c.set(Calendar.YEAR, 2010);
		work(c);
		
		//获取当前日历的Date形式
		Date date = c.getTime();
		System.out.println(date);
		//把Date设置日历中
		c.setTime(new Date());
		work(c);*/
		
		//需求 140天后是什么日子
		c.add(Calendar.DAY_OF_MONTH, 140);
		work(c);
		//回到3000年前
		c.add(Calendar.YEAR, -3000);
		work(c);
	}

	private static void work(Calendar c) {
		//获取日历中字段的值
		int year = c.get(Calendar.YEAR);
		//获取月   这里的1月是使用0来表示
		int month = c.get(Calendar.MONTH) + 1;
		//获取日
		int day = c.get(Calendar.DAY_OF_MONTH);
		//获取小时
		int hour = c.get(Calendar.HOUR_OF_DAY);
		//获取分钟
		int minute = c.get(Calendar.MINUTE);
		//获取秒
		int second = c.get(Calendar.SECOND);
		String info = String.format("%d年%d月%d日--%d时%d分%d秒", 
				year, month, day, hour, minute, second);
		System.out.println(info);
	}
}
