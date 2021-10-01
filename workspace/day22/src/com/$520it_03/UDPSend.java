package com.$520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws Exception {
//		1：创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
//		2：准备数据，打成数据包
		String data = "hello UDP";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getByName("localhost");
		int port = 10086;
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, port);
//		3：调用方法发送数据包
		ds.send(p);//只管发,没有报错就算成功了
//		4：关闭资源
		ds.close();
	}
}
