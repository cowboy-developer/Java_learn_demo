public class PersonDemo {
	public static void main(String[] args)	{
		/*
		//����һ��Person����
		Person p = new Person();
		//��Person��Ա������ֵ
		p.name = "������";
		p.age = 10;
		System.out.println("�޸�ǰ:" + p.age);
		//������������
		p.age = 8;		
		System.out.println("�޸ĺ�:" + p.age);

		Person p2 = new Person();
		p2.name = "������";
		p2.age = 65;
		System.out.println("�޸�ǰ:" + p2.age);
		//Ҳȥ�޸�����
		//p2.age = -60;//��Դ-->��Ʋ�����
		//System.out.println("�޸ĺ�:" + p2.age);
		//�Ժ��޸����䲻Ҫֱ�Ӹ�,ͨ����������
		p2.setAge(60);
		System.out.println("�޸ĺ�:" + p2.age);
		//��ʱǰ���������Ȼ��һ���̶��Ͻ����,���Ǹ�Դ����û�н��
		p2.age = -40;//�������:�������������޸���ĳ�Ա����
		System.out.println("�޸ĺ�:" + p2.age);
		*/
		Person p = new Person();
		//Person@58e4d7f7  ��������Object��toString�������ص�
		System.out.println(p);
	}
}

class Person {
	String name;
	int age;
	//Ĭ�ϵ�����@��ϣ�벻�����ҵ�����
	@Override
	public String toString() {
		return "name=" + name + ",age=" + age;
	}
	//if(age < 0) {};
	//������Щִ����䶼���߼�����,������ڷ�����
	//��������������ж����ֵ�Ƿ����
	public void setAge(int a) {
		//�Ը�ֵ�������ж�
		if (a > 0) {
			age = a;
			System.out.println("�޸ĳɹ�");
		} else {
			System.out.println("��������,��˶�");
		}
	}
}
