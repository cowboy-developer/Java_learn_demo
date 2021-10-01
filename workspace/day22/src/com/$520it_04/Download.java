package com.$520it_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Download {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10086);
		while (true) {
			Socket s = ss.accept();
			
			BufferedOutputStream out = new BufferedOutputStream(s.getOutputStream());
			//开始读取要上传的文件
			BufferedInputStream in = new BufferedInputStream(
					new FileInputStream("upload/1.png"));
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) != -1) {
	//			//把数据写到服务器
				out.write(buf,0 ,len);
				out.flush();
			}
//			s.shutdownOutput();
			s.close();
		}
//		ss.close();
	}
}
