public class InitCodeDemo {
	public static void main(String[] args)	{
		new Animal();
		new Animal();
		new Animal();
	}
}

class Animal {
	static String name;
	//ʹ��static���εĹ�������,��̬�����
	static {
		//�����õ�ר�ų�ʼ����̬�ĳ�Ա����
		//ִֻ��1��,JVM����classʱ�ͻ��Զ�ִ��
		System.out.println("��̬�����");
	}
	int i;	
	Animal() {
		//���췽���������ǳ�ʼ������,static���εĲ����ڶ���
		//name = "";
		i = 10;
		System.out.println("Object");
	}

	//��������
	{
		//����������ִ��
		System.out.println("init");
	}

	public static void work() {
		System.out.println("fu");
	}

	public void eat() {
		System.out.println("�Բ�");
	}
}