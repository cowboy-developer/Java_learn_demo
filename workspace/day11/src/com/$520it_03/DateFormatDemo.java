package com.$520it_03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		//希望出的格式是xxxx年xx月xx日 星期x xx时xx分xx秒
		String pattern = "yyyy-MM-dd HH时mm分ss秒";//忘记了查文档
		DateFormat df = new SimpleDateFormat(pattern);
		
		//格式化
		String str = df.format(new Date());
		System.out.println(str);
		
		//解析
		String d = "1997-7-1 00时00分00秒";
		Date date = df.parse(d);
		System.out.println(date);
	}

	private static void work() throws Exception {
		//获取对象
		//这个方法底层返回了DateFormat的子类对象
//		DateFormat df = DateFormat.getInstance();
		//获取到的不同对象,其效果都是一样的,只是出来的内容格式不同而已
		DateFormat df = DateFormat.getDateTimeInstance();
		
		//核心   解析   格式化
		//我们现在还不能解析,应为我不知道这个String怎么去写
		//先看格式化出来的结果,然后再参照
		String str = df.format(new Date());//日期-->字符串
		System.out.println(str);
		
		//表示下2015年12月10日 下午 2点整
		//思路:如果使用Date的构造方法我们必须要知道这个时间的毫秒值,行不通
		//	通过解析一个字符串得到Date对象
		String d = "2015-12-10 14:00:00";
		Date date = df.parse(d);//字符串-->日期
		System.out.println(date.toLocaleString());
	}
}
