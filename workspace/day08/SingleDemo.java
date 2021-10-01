public class SingleDemo {
	public static void main(String[] args)	{
		//����:�ڴ���ֻ����һ��Single����
		Single s1 = Single.getInstance();
		//System.out.println(s1);
		Single s2 = Single.getInstance();
		System.out.println(s2 == s1);//true
		s1.work();
	}
}

class Single {
	/*
		˼��:Ҫ������������õ����췽��
			�������������ù��췽��,ԭ���ǹ��췽����¶��public
			���췽��˽�к�ֻ�б�����ܵ���,���뱾�ഴ������
			��Ա����˽�к��ⲿ�����õ�����
		���:˽�л����췽��
			ʹ�ó�Ա�������汾�����,����˽�к;�̬
			�ṩһ�������ķ������ؾ�̬�ֶ�
	*/
	//1:˽�л����췽��
	private Single() {}
	//2:ʹ�ó�Ա�������汾�����
	private static Single s = new Single();
	//3:�ṩ�����ķ���,���ر������
	public static Single getInstance() {
		return s;
	}

	//����ʡ��N���ʵ������
	public void work() {}
}
