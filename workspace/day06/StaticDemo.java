public class StaticDemo {
	public static void main(String[] args)	{
		//����һ������
		Person p1 = new Person("��ȫ������", "�ձ�");
		//�������������static��ʾ�������и�
		//Person.killSelf();
		//����������Ǿ�̬����,������Ϊ
		p1.killSelf();
	}
}

class Person {
	//�������������óɾ�̬,�����˵����ֶ�һ��
	String name;
	String country;//�������óɾ�̬

	Person(String n, String c) {
		name = n;
		country = c;
	}

	//�и�,��Ʋ�����
	//public static void killSelf() {
	//���ڶ���,������Ϊ
	public void killSelf() {
		System.out.println(name + "�и��Ծ�,�ܹ���");
	}
}
