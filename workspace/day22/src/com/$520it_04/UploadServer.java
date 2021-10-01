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
		
		//����һ�������ļ��������
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream("upload/1.png"));
		
		//ʹ��Ч�ʸߵĻ�����
		BufferedInputStream in = new BufferedInputStream(s.getInputStream());
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) != -1) {
			//�������ݵ���������
			out.write(buf, 0, len);
			out.flush();
		}
		out.close();
		
		s.close();
		ss.close();
	}
}
