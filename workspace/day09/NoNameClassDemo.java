public class NoNameClassDemo {
	public static void main(String[] args)	{
		/*
		Dog d = new Dog();
		//����ֻʹ��1�����Dog��
		


		*/
		//�����ڲ���,ʹ��ʱ�����ϴ��������ڲ���Ķ���
		//IWalkable() {}����,��������������ڲ���
		//new IWalkable() {}���������һ������
		work(new IWalkable() {
			//��д����ķ���
			public void walk() {
				System.out.println("...1walk1...");
			}
		});

		new Dog() {};
	}

	public static void work(IWalkable walk) {
		walk.walk();	
	}
}

class Dog implements IWalkable {
	public void walk() {
		System.out.println("...walk...");
	}
}

interface IWalkable {
	void walk();
}