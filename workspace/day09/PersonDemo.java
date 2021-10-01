public class PersonDemo {
	public static void main(String[] args)	{
		/*
		//����һ������
		//Person p = new Person("������", new Gender('��'));
		Person p = new Person("������", Gender.MAN);
		System.out.println(p);
		//����gender��char����,ֻҪ���ַ�����
		//����Gender�Ĺ��췽��û��˽��,�ⲿ�������ⴴ������
		//p = new Person("������", new Gender('��'));
		p = new Person("������", Gender.WOMAN);
		//���������Ա�ֻ���л�Ů
		System.out.println(p);
		
		p = new Person("������", Gender.MAN);
		*/
		Gender g = Gender.WOMAN;
		//switchֻ֧������
		switch (g) {
			//����,����ö��ֻдֵ
			case MAN:
				System.out.println("man");
				break;
			case WOMAN:
				System.out.println("woman");
				break;
			default:
		}
	}
}

//ö��ʵ�ֽӿ�,ֻ��ʹ�������ڲ�������д
//������һ��ö����,�����ĸ�����Enume
enum Gender implements A {
	//��һ�б���д��̬�ֶ�
	//ö��ֵ���(ʵ��)��ʾ���ù��췽��
	//�ں����{}��ʾ����ö�����͵������ڲ���
	//ö�ٵ�ֵ�ǹ̶���,��粻���ٴ�����ö�ٶ���
	//�����дö���еĳ��󷽷�,�����ڲ���
	MAN('��') {
		//��д���󷽷�
		public void work() {
			System.out.println("nan ... wrok");
		}
	},WOMAN('Ů') {
		//��д���󷽷�
		public void work() {
			System.out.println("woman ... wrok");
		}
	};
	//��ĳ�Ա����д�ھ�̬�ֶκ���
	private char gender;
	
	//����˽��
	Gender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return gender + "";
	}

	//abstract void work();
}

interface A {
	abstract void work();
}

/*
class Gender {
	private char gender;
	//�ṩ��̬�ֶ�,��֤�����޸�,ʹ��final����
	public static final Gender MAN = new Gender('��');
	public static final Gender WOMAN = new Gender('Ů');

	private Gender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return gender + "";
	}
}
*/

class Person {
	private String name;
	//����������ͱȽ����в�����,ʹ���Զ�������
	//private char gender;
	//ʹ���Զ��������
	private Gender gender;

	Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
		/*
		if (gender == '��' || gender == 'Ů') {
			this.gender = gender;
		} else {
			this.gender = 'Ů';
		}
		*/
	}

	public String toString() {
		return "Person [name=" + name + ",gender=" + gender + "]";
	}
}
