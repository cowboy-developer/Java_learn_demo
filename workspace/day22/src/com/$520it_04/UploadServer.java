package com.$520it_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		
		//定义一个保存文件的输出流
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream("upload/1.png"));
		
		//使用效率高的缓冲流
		BufferedInputStream in = new BufferedInputStream(s.getInputStream());
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) != -1) {
			//保存数据到服务器上
			out.write(buf, 0, len);
			out.flush();
		}
		out.close();
		
		s.close();
		ss.close();
	}
}
