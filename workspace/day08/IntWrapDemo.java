public class IntWrapDemo {
	public static void main(String[] args)	{
		//����
		//������������10
		IntWrap i1 = new IntWrap(10);
		//������������20
		IntWrap i2 = new IntWrap(20);
		//������������  *
		//�õ������ֵ��������
		System.out.println(i1.intValue() * i2.intValue());
		//�����ֵ����Сֵ
		System.out.println("int max:" + IntWrap.MAX_VALUE);
		System.out.println("int min:" + IntWrap.MIN_VALUE);
	}
}

//����int����
class IntWrap {
	//���ֵ/��Сֵ
	public static final int MAX_VALUE = 2100000000;
	public static final int MIN_VALUE = -2100000000;

	private int i;	
	//ʹ�ù��췽����װint����
	IntWrap(int i) {
		//����Ϊ��Ա����
		this.i = i;
	}

	//�����������е���Ϊ
	public int intValue() {
		//�����ڲ������ֵ
		return i;
	}
}
