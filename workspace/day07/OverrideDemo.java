//�����ĸ���/��д
public class OverrideDemo {
	public static void main(String[] args)	{
		//����һֻ���
		Penguin p = new Penguin();
		//�������ɵķ���
		//��������������,����ʵ������첻���
		p.fly();
		//ʵ���ϵ�Penguin.work();
		p.work();
		//ʹ����������
	}
}

class Penguin extends Bird {
	//�̳������,�̳�fly�ķ���,��ʱ���������ʵ���ʺ������
	//��������д
	//����ֵ���ͱ����Ǹ������з���ֵ���͵��������
	//����Ȩ�ޱ���������
	//����ǩ������һ��
	//��������д�и�ǰ��,�����ڼ̳еĻ�����
	/*
	@Override
	public void fly() {
		System.out.println("˦�˼��³���ַɲ�����");
		//Ҫ����ñ����ڸ�����-->���ø���ķ���
		//��ȷ˵����������Ǹ���ķ���
		//super��ʾ���ǵ�ǰ�����ĸ���
		super.fly();//���ø��౻���ǵķ���
		System.out.println(i);
	}
	*/

	Penguin(int i) {
		//Ĭ��û��д,��һ�д������super();
		//���ڹ��췽������ʵ��ִ�еĵ�һ�����Ҳһ����super();
		//�������û���޲ι���,�����ڹ��췽���ĵ�һ��ʹ��super(����)
		super(i);
	}

	Penguin() {
		//��ͬһ�����췽���в���ͬʱ����this()��super()
		//super();//���ø�����޲ι���
		this(0);
		//Ĭ��û��д,��һ�д������super();
	}

	int i = 10;

	public void fly() {
		System.out.println("�����i:" + i + ",�����i:" + super.i);
	}

	public static void work() {
		System.out.println("sub");
	}
}

class Bird {
	int i = 0;
	public Bird(int i) {}

	public static void work() {
		System.out.println("super");
	}

	//����
	public void fly() {
		System.out.println("...fly...");
	}
}
