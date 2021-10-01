package com.$520it_06;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//创建定时器
		Timer timer = new Timer();
		
		//分配任务
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("任务执行了");
			}
		};
		//参数1:执行任务  参数2:第一次执行的时间
//		timer.schedule(task, new Date());
		//参数3:循环执行的间隔时间(周期)
		timer.schedule(task, new Date(), 1000);
		
//		timer.scheduleAtFixedRate(task, new Date(), 1000);
		//关闭定时器,一般都不关
		timer.cancel();
	}
}
