package com.$520it_05;

public class App {
	public static void main(String[] args) {
		String username = "admin";
		//ע�Ṧ��
		resgist(username);
		
		//ģ��ע����Զ���¼1��
		System.out.println("��ӭ" + username);
	}
	
	public static void resgist(String username) {
		if ("admin".equals(username)) {
			//����ע��
//			System.out.println("ע��ʧ��");
			//Ӧ��ʹ���쳣�������������ʧ����
			//��������쳣���������ָ�ʽ�������,���ܱ�ʾע���쳣
//			throw new NumberFormatException();
			//��ʱ����Ӧ���Զ����쳣
			throw new UsernameException("�û����Ѿ�����");
		}
		
		System.out.println("ע��ɹ�");
	}
}
