package com.$520it_05;
/**
 * ��������ע��ʱ�û����Ѿ����ڵ��쳣
 */
public class UsernameException extends RuntimeException {

	//����Ҫ�����¹��췽��
	//���÷�װ�쳣����Ϣ
	public UsernameException(String message) {
		super(message);
	}
	//������췽�����������쳣��ת��
	public UsernameException(Throwable cause) {
		super(cause);
	}
}
