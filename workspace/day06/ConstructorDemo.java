public class ConstructorDemo {
	public static void main(String[] args)	{
		//��ʾ������
		Person p1 = new Person();
		//���˶�����ٸ�����ֵ
		p1.name = "��С��";
		p1.age = 1;
		System.out.println(p1.name + ":" + p1.age);
		//��ϣ������һ���־���ֵ
		//���ݲ������ù��췽��
		Person p2 = new Person("������");
		System.out.println(p2.name + ":" + p2.age);
		Person p3 = new Person("������", 30);
		System.out.println(p1.name + ":" + p1.age);
		System.out.println(p2.name);
		//ʹ�ù��췽����������ʱҪע��,ֻ�ܵ��ô��ڵĹ��췽��
		//new Person(13);//��������
		//���ǽ���,��������ĳ���������
		Person.lvUp();//��ʾ��������
		Person.lvUp();//��ʾ��������
		//��������������������ĳ������,���ǵ�һ�ĸ���
		/*
			p1.lvUp();
			p2.lvUp();
			p3.lvUp();
		*/
		System.out.println(p1.civilized + ":" 
			+ p2.civilized + ":" + p3.civilized);
		//������Ķ��ӳ�����
		Person p4 = new Person("������", 0);
		//��ƺ�����
		//������p4.civilized,��ʹ�ö������,���Ƕ����Ǿ�̬�Ĳ����ڶ���
		//���Ա��������Ҿ���,ʹ����������p4.civilized--->Person.civilized
		System.out.println(p4.name + ":" + p4.civilized);
	}
}

class Person {
	String name;
	int age;
	//����static���ʾ��������Person����
	static int civilized;//�������������

	//û�й��췽��,���ǻ�Ĭ����һ��
	Person() {} //�����ǳ�ʼ���������Ϣ
	//����д�˹��췽����û����Ĭ�Ϲ���
	Person(String n) {//����һ��������ֵ
		name = n;
	}
	//ϣ��������������ֺ�����
	Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//������
	public static void lvUp() {//��������
		civilized++;
		System.out.println("�����µĹ�����,�ȼ�����");
	}

	public void show() {
		System.out.println("...do show..." + civilized);
	}

	public void makeMoney() {
		System.out.println("...make money...");
	}
}
