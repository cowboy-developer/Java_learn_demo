public class PersonDemo {
	public static void main(String[] args) {
		//�������ʹ�������
		//�﷨:�������� ������ = ����(new ��������);
		//����һ��Person���͵Ķ���,ʹ�ñ���p1������
		Person p1 = new Person();
		//��������  ��������ķ���
		//���ö��������Ŀ�ķ���
		//�﷨:����.����();
		p1.show();//p1����Ķ�������Ŀ
		//���ö������Ǯ����
		p1.makeMoney();//p1����Ķ�����Ǯ
		
		//ÿ��new���ᴴ��һ���µĶ���
		Person p2 = new Person();
		//������p1����Ķ�������,��p2û�й�ϵ��
		//��p2�����name��ֵ
		p2.name = "������";
		//������p2�����nameֵ
		//�﷨:����.��Ա����
		System.out.println("p2.name=" + p2.name);
		//p1��p2����ͬһ������,�໥֮��û�й�ϵ
		p1.name = "������";
		System.out.println("p1.name=" + p1.name);
		
		//Person@181ec6b9  ����@��ϣ��
		System.out.println(p1);
		//�ڴ��ַ����ͬ˵������ͬһ������
		System.out.println(p1 == p2);
		
	}
}

//ʹ�����������������
class Person {//�ó�Ա�����ͷ��������ö����,ģ������
	//��Ա����-->����״̬
	String name;//��������
	int age;//��������

	//����-->������Ϊ
	public void show() {//��������Ŀ
		System.out.println("...do show...");
	}

	public void makeMoney() {//������Ǯ
		System.out.println("...make money...");
	}
}