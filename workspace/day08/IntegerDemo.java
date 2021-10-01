public class IntegerDemo {
	public static void main(String[] args)	{
		//��ʾInteger
		//1:��������
		Integer i1 = new Integer(10);
		//��ʾ���ֵ��double��ʽ
		//System.out.println(i1.doubleValue());
		//���ض���int���͵�ֵ
		System.out.println(i1.intValue());

		//����:
		//MAX_VALUE ���ֵ
		System.out.println(Integer.MAX_VALUE);
		//MIN_VALUE ��Сֵ
		System.out.println(Integer.MIN_VALUE);

		//valueOf����  ����������Ӧ��Integer����
		Integer i2 = Integer.valueOf(100);
		//Integer��д��toString����
		System.out.println(i2);//100

		//parseInt����   ���ַ������͵�����ת���int����
		//����Ҫ��ʾ��������12+3
		//System.out.println("12" + 3);//123
		//NumberFormatException: For input string: "1a2"
		//�������ֻ��ת��������
		//int num = Integer.parseInt("1a2");
		int num = Integer.parseInt("12");
		System.out.println(num + 3);//15

		//toBinaryString����  ת�ɶ�����
		System.out.println(Integer.toBinaryString(3));
		//toOctalString����   ת�˽���
		System.out.println(Integer.toOctalString(9));
		//toHexString����     ת16����
		System.out.println(Integer.toHexString(15));
	}
}
