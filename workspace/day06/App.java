public class App {
	public static void main(String[] args)	{
		//����3��ѧ������
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		//��3��ѧ��������
		s1.name = "������";
		s2.name = "������";
		s3.name = "��С��";
		
		//�����꽻��
		s1.fees();
		//�����Ԫ��ȫ����Student����,����������Student[]
		Student[] stus = {s1, s2, s3};

		//�鿴����ǰ�Ľ��
		for (Student s : stus) {
			System.out.println(s.name + ":" + s.fee);
		}

		//��������,�ҳ�û�н��ѵ�ѧ������
		for (Student s : stus) {
			//������s����ľ���ÿһ��Ԫ��
			if (!s.fee) {//û�н��ѵĲ�ִ�н���
				//������ִ��,û�н��Ѳ�ִ��
				s.fees();
			}
		}

		//�鿴���Ѻ�Ľ��
		for (Student s : stus) {
			System.out.println(s.name + ":" + s.fee);
		}
	}
}

//���ﲻ���ڲ���,�����֮���ǲ�Ƕ�׵�
class Student {
	/*
		���췽�����ƺ�������ȫһ��
		û�з���ֵ��������
		����дreturn,���ǲ�����ֵ
	*/
	Student() {
		System.out.println("���󴴽���");
		//return 0x11111;������ֵ����
	}

	//���������ͽ���
	String name;
	boolean fee;//t:�ѽ� f:δ��

	//����������Ϊ
	public void fees() {
		//�����߼�
		fee = true;
		System.out.println(name + "����");
	}
}
