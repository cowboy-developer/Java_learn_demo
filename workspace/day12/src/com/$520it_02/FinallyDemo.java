package com.$520it_02;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println(get());
	}
	
	public static int get() {
		int i = 0;
		try {
			//��ִ��return��ֵ����ȥ,��ִ��finally
			//System.exit(0);
			return i;
		} finally {
			System.out.println(111);
		}
	}

	private static void work() {
		System.out.println("start");
		//���Ĵ���
		//finall��Ҫ�������������ͷ���Դ
		try {
//			InputStream is = new FileInputStream("c:/setup.exe");
			System.out.println("ʹ����Դ");
			int a = 1 / 0;
			//��Դʹ����Ϻ�����ͷ�,���ͷžͻᵼ���ڴ�һֱռ��
//			is.close();//�ͷ���Դ
		} catch (Exception e) {
			//��������
			System.out.println(e.getMessage());
		} finally {
			//��try�еĴ��������Ƿ����쳣����ִ��
			System.out.println("�ͷ���Դ");
		}
		
		System.out.println("end");
	}
}
