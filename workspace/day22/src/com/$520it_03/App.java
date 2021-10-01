package com.$520it_03;

import java.io.Console;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class App {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(10086);
		//�����������ݵ��߳�
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
			//���ݰ�����ѭ��ʹ��,����ÿ�ζ�����
			DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
			while (true) {
				ds.receive(p);
				//�������ݰ�
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
		//�������ݵ��߼� ������Դ�ڿ���̨
		try {
			while (true) {
				//��ȡ����̨������
				System.out.println("��������������:");
				String data = console.readLine();
				//���ͷ�������
				String fei = "1:100:���ڵ�����:ĳĳ��ʦ:32:" + data;
				
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
