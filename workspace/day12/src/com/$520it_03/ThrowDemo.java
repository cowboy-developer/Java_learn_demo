package com.$520it_03;

//�쳣���׳�
public class ThrowDemo {
//	public static void main(String[] args) throws NumberFormatException {
	
	public static void main(String[] args) {
		//NumberFormatException�Ķ�����������ʱ���쳣
		Integer.parseInt("");
		
	
		System.out.println("Ѱ�ҿͻ�");
		System.out.println("Լ̸ϸ��");
		System.out.println("���ǱȽ�");
		
		//����ǩ��
		//�����ҵ����˴����쳣�ķ���,��˼����˵ִ������������ܳ�����
		//1:����ʹ��try-catch,�Կ��ܲ������쳣������
//		try {
//			work();
//		} catch (Exception e) {
//			System.out.println("��ǩ����");
//			return;
//		}
		//ʹ���׳��쳣�ķ�ʽ,һ�������쳣����쳣�������׳�JVM
		//work();
		System.out.println("ҵ��Ա������˾");
		System.out.println("����");
		System.out.println("����");
	}
	
	//ʹ��throws���������׳��쳣������
	private static void work() throws Exception {
		System.out.println("ҵ��Ա����");
		System.out.println("�ﵽ�ͻ���˾");
		System.out.println("���쵼ǩ��ͬ");
		//һ��������ڲ��������
		//�������������Ǹ���������߳�������
		//��Java�����һ�������е����ݳ�������,�����׳�һ���쳣
		//ʹ��throw�׳�һ���쳣�Ķ���
		System.out.println("���ﲻҪ��");
		System.out.println("ǩ��ͬʧ����");
		//����ǩ��ʧ��--->ʹ���׳��쳣����
		//������ֱ���,���Ǵ����д�,�������쳣,����쳣��������������ߵ����ҵķ���֪����
		//����쳣�������ڲ��ܴ����,��ʱ�����ڷ������������쳣
		throw new Exception("�ͻ�ǩ��ʧ��!");
	}
}
