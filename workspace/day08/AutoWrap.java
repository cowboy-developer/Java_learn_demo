public class AutoWrap {
	public static void main(String[] args)	{
		/*
		//��ʾ�Զ���װ��Ͳ���
		//�ѻ������͵�ֱֵ�Ӹ�ֵ����װ��,�Զ�װ��
		//�������ֻ�л������ͺ�����Ӧ�İ�װ�����ʹ��
		Integer i1 = 10;//�Զ�װ��
		//�Ѱ�װ���ֱֵ�Ӹ�ֵ����������,�Զ�����
		int num = i1;//�Զ�����
		*/
		//ͨ���Զ�װ��-->valueOf����
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//true

		i1 = 127;
		i2 = 127;
		System.out.println(i1 == i2);//true

		i1 = 128;
		i2 = 128;
		System.out.println(i1 == i2);//false
	}
}
