package com.$520it_03;

import java.io.Console;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class App {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(10086);
		//开启接收数据的线程
		new Thread(new Receive(ds)).start();
		new Thread(new Send(ds)).start();
	}
}

class Receive implements Runnable {
	private DatagramSocket ds;
	
	public Receive(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			//数据包可以循环使用,不必每次都创建
			DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
			while (true) {
				ds.receive(p);
				//解析数据包
				byte[] data = p.getData();
				int len = p.getLength();
				String ip = p.getAddress().getHostAddress();
				System.out.println(String.format("%s-->%s", 
						ip, new String(data, 0, len)));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} 
}

class Send implements Runnable {
	private DatagramSocket ds;
	private Console console;
	
	public Send(DatagramSocket ds) {
		this.ds = ds;
		console = System.console();
	}

	@Override
	public void run() {
		//发送数据的逻辑 数据来源于控制台
		try {
			while (true) {
				//获取控制台的数据
				System.out.println("请输入聊天内容:");
				String data = console.readLine();
				//发送飞秋数据
				String fei = "1:100:隔壁的老王:某某老师:32:" + data;
				
				byte[] buf = fei.getBytes();
				InetAddress address = InetAddress.getByName("192.168.36.255");
				int port = 2425;
				DatagramPacket p = new DatagramPacket(buf, buf.length, address, port);
				ds.send(p);
				
				if ("88".equals(data)) {
					System.exit(0);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
