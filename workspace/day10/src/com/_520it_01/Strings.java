package com._520it_01;

//�ַ����Ĺ�����
public class Strings {
	private Strings() {}
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param str Ҫ�ж��ַ���
	 * @return true ��
	 */
	public static boolean isEntity(String str){
		//ֻҪ������null����ȫ�հ� ����true
		//����null������ڵ�һλ
		if (str == null) {
			return true;			
		}
		//ȥ����β�����пո�
		str = str.trim();
		if (str.length() > 0) {//������
			return false;
		} 
		
		return true;
	}

}
