package com.$520it_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChangeExceptionDemo {
	public static void main(String[] args) {
		work();
	}
	
	//����ֱ���׳����쳣,���±��˵����ҵĴ���ҲҪ��
	private static void work() {
		//�����Դ���һ����Դ
		try {
			//FileNotFoundException
			new FileInputStream("asdsda");//�б���ʱ���쳣
		} catch (FileNotFoundException e) {
			//�����Ǵ����ļ�û���ҵ����쳣
			//���ܴ�����쳣
//			ֻҪͨ���׳��쳣,���˲���֪���������������
//  		���ⷽ��ʹ��try-catch��Ŀ�ľ���Ϊ���ڷ����ϲ����쳣
//			Ҫ�ﵽ�����ϲ����쳣,������Ҫ֪����������쳣,����Ը��쳣����ת��
//			����ʱ���쳣 --> ����ʱ���쳣
			//���ֱ��ʹ��һ���µ��쳣,��ԭ�����쳣��Ϣ�Ķ���
			//�쳣��ת�ͱ��뱣���쳣��Ϣ�Ĵ���
			throw new RuntimeException(e);
		}
	} 
}
