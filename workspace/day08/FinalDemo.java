public class FinalDemo {
	public static void main(String[] args)	{
		//new Zi();
		//��ʾ�������������յ�,�������޸�
		//final���α�����ʾ����
		final int I = 10;//����
		//����: �޷�Ϊ���ձ���i����ֵ
		//I = 0;�����
		//�����ҵ�����
		//������ʶ��ȫ����д,���ʼ�ʹ��'_'
		final String MY_NAME = "��С��";

		final int[] ARR = {1,2,3};
		//�����޸�
		ARR[0] = 0;
		//ARR����ָ����������
		//����:ARR�ǳ���,��ʾ�������õĵ�ַ���ܱ�
		//ARR = new int[1];�����
	}
}

class Fu {
	Fu() {
		//����������ʼ��
		work();
	}
	//������������ر���Ҫ,�������޸�
	public void work() {
		System.out.println("���ĳ�ʼ��");
	}
}

class Zi extends Fu {
	//��д����ķ���
	//����: Zi�е�work()�޷�����Fu�е�work()
	public void work() {
		System.out.println("�ڿͳ�ʼ��");
	}
}
