package com.$520it_04;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) throws Exception {
		File saveFile = new File("save1");
		//专门记录进度的随机访问文件,要保证数据存储到设备的底层
		RandomAccessFile save1 = new RandomAccessFile(saveFile, "rwd");
		
		File file = new File("c:/1.png");
		//获取文件的大小
		long fileLen = file.length();
		
		//这个的作用是专门读取数据
		RandomAccessFile in = new RandomAccessFile(file, "r");
		RandomAccessFile out = new RandomAccessFile("c:/2.png", "rw");
		
		//设文件下载后的大小
		out.setLength(fileLen);
		
		//读取文件之前判断是否有进度
		if (saveFile.length() != 0) {
			long i = save1.readLong();
			System.out.println(i);
			//继续上次的进度
			in.seek(i);
			out.seek(i);
		}
		
		long pointer;
		while ((pointer = in.getFilePointer()) != fileLen) {
			//开始读取
			int data = in.read();
			out.write(data);
			//更新进度
			save1.seek(0);
			save1.writeLong(pointer + 1);
		}
		
		in.close();
		out.close();
	}

	private static void work() throws Exception {
		//创建随机访问文件对象
		RandomAccessFile file = new RandomAccessFile("c:/1.txt", "rw");
//		获取文件指针
		long index = file.getFilePointer();
		System.out.println("默认:" + index);
		
		//读写数据
		file.writeBoolean(true);
		file.writeInt(100);
		
		index = file.getFilePointer();
		System.out.println("现在:" + index);
		
		//重置文件指针
		file.seek(0);
		
		boolean b = file.readBoolean();
		System.out.println(b);
		int i = file.readInt();
		System.out.println(i);
		
		//关闭资源
		file.close();
	}
}
