package com.seemygo.feiq.service.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.seemygo.feiq.listener.IShowUIListener;
import com.seemygo.feiq.pojo.Data;
import com.seemygo.feiq.service.IFeiqService;

//服务的实现类
public class FeiServiceImpl implements IFeiqService {
	private DatagramSocket ds;
	private IShowUIListener l;
	//耦合
//	private JTextArea readArea;
	
	public FeiServiceImpl(IShowUIListener l) {
		try {
			this.l = l;
			ds = new DatagramSocket(10010);
		} catch (SocketException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void send(final Data data) {
		//专门开启线程发数据
		new Thread() {
			public void run() {
				try {
					//发送数据的功能
					byte[] buf = data.getData().getBytes();
					InetAddress address = InetAddress.getByName(data.getIp());
					DatagramPacket p = new DatagramPacket(buf, buf.length, address , 10010);
					
					ds.send(p);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}.start();
	}

	@Override
	public void accept() {
		//开启线程专门收数据
		new Thread() {
			public void run() {
				try {
					DatagramPacket p = new DatagramPacket(new byte[60 * 1024], 60 * 1024);
					//调用Socket的接收数据的方法
					while (true) {
						ds.receive(p);
						String ip = p.getAddress().getHostAddress();
						byte[] data = p.getData();
						//把数据显示在只读的文本域上
						l.updateUI(new Data(ip, new String(data, 0, p.getLength())));
//						这个设计不合理,有耦合
//						readArea.append(String.format("%s===>%s\n", 
//								ip, new String(data, 0, p.getLength())));
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}.start();
		
	}
}
