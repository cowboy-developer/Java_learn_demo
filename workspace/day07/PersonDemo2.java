//��ʾ��װ
public class PersonDemo2 {
	public static void main(String[] args)	{
		//this���Ǿ�̬��
		//this.main(null);
		//����һ��Person����
		Person p1 = new Person();
		//��Person��Ա������ֵ
		/*	����ʹ��private����,��粻�ܷ���
			p.name = "������";
			p.age = 10;
		
			System.out.println("�޸�ǰ:" + p.age);
			//������������
			p.age = 8;		
			System.out.println("�޸ĺ�:" + p.age);
		*/
		//���ò�������setter����
		p1.setName("������");
		p1.setAge(10);
		//��ȡֵ����getter����
		System.out.println(p1.getName() + ":" + p1.getAge());

		Person p2 = new Person();
		
		p2.setName("������");
		p2.setAge(20);
		
		System.out.println(p2.getName() + ":" + p2.getAge());

		Person p3 = new Person("������");
		System.out.println(p3.getName() + ":" + p3.getAge());
	}
}

//��װ
class Person {
	//��Ա�������ܱ����ֱ�ӷ���
	private String name;
	private int age;
	
	public Person() {
		//System.out.println();
		//��this�������ع��췽�������ǹ������еĵ�һ�����
		this(null, 0);//��������Ĭ��ֵ
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		//�ڹ��췽����ʹ��this��ʾ�������صĹ��췽��
		//this.name = name;
		//this();
		this(name, 0);//���ڲ������ı���ʹ��Ĭ��ֵ
	}


	//����ʹ��private��粻�ܷ���
	//���ַ��������ڲ�,�������Է���
	//�ṩ����,�����ͨ����������,��������Ա����

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		//�Ը�ֵ�������ж�
		if (age > 0) {
			this.age = age;
			System.out.println("�޸ĳɹ�");
		} else {
			System.out.println("��������,��˶�");
		}
		//Ĭ�ϵ���ʵ�������Ķ�����this,Ҳ����˵������ڲ����ÿ���ʡ��this
		System.out.println("�ҵ�������" + getName());
	}

	//�ṩgetter����
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
