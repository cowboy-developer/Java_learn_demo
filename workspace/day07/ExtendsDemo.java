//��ʾ�̳�
public class ExtendsDemo {
	public static void main(String[] args)	{
		//����һ����
		Dog d = new Dog();
		//���ù��Զ����ķ���
		//������������ڸ�������public�����Զ��̳�
		d.eat();
		d.sleep();

		d.name = "����";
		System.out.println(d.name);
	}
}

//��������Ķ���,���̳ж���
//����Dog�̳���Animal,Animal�̳���Object,Dog��Ҳ�Ǽ�Ӽ̳�Object
class Dog extends Animal {
	//�����ͼ̳���Animal�еĲ��ֳ�Ա
	//public��protected���Լ̳�
	//ȱʡ����ͬ����Ҳ���Լ̳�
	//˽�еĲ��ܼ̳�
}

//class Animal//�����û����ʾ�̳�,Ĭ�ϼ̳�java.lang.Object
//�������д����ǵȼ۵�
class Animal extends Object//,java.util.Arrays����,ֻ��ֱ�Ӽ̳�һ����
{
	//protected String name;
	//private String name;

	public void eat() {
		System.out.println("...eat...");
	}

	public void sleep() {
		System.out.println("...sleep...");
	}
}
