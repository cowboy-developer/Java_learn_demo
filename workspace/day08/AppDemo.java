public class AppDemo {
	public static void main(String[] args)	{
		/*
		//��ʱ���Cat�м�������
		//Cat����Cat����,CatҲ����Animal������
		Cat c = new Cat();//è��������è������
		//�������� : ��������
		Animal a = new Cat();//è�����ڶ��������
		//��̬
		//�����г���ʱ,���������õ��Ƕ���,Ҳ����˵����ִ�е���Cat��eat����
		a.eat();
		//Dog d = new Dog();
		//d.eat();
		//����Cat���ͺ�Dog����û�м̳й�ϵ
		//d = new Cat();
		//���̳��˶���,���ڶ��������
		a = new Dog();
		a.eat();
		
		Person p = new Person();
		Dog d = new Dog();
		//ι��
		p.feed(d);
		//����һֻè
		Cat c = new Cat();
		p.feed(c);

		Animal a = new Dog();
		//a.i��ʾ����ȥAnimal����i
		System.out.println(a.i);//10
		*/
		new Dog();
	}
}

class Person {
	//�����ҵķ����޶���̫����,ֻ��ι���ص�Ķ���
	//������Щ���ﶼ�̳�һ������,AnimalҪ�����еĶ��ﶼ����Animal������
	public void feed(Animal a) {
		System.out.println("...feed...");
		a.eat();
		//��̬��,Ҫ����õ��������еķ���(ǿת)
		//Ӧ�������ȷǿת,�����èת��è,����ǹ�ת�ɹ�
		if (a instanceof Cat) {
			//������������˵����������è
			Cat c = (Cat) a;//ת��è
			c.catchMouse();
		} else {
			//������������˵����������ǹ�
			Dog d = (Dog) a;
			d.watch();
		}

		//System.out.println("" instanceof Animal);//�����ʹ��
		/*
		//��һ�εĹ�,��ԭ�ɹ�
		���ǵڶ��δ�����è,����ת������
		ClassCastException: Cat cannot be cast to Dogè����ת���ɹ�
		Dog d = (Dog) a;
		//ǿת�����������Dog,ȥDog����watch����
		d.watch();
		//
		*/

		//work�����Ǿ�̬��,ʹ�õ��Ǳ�������������������
		//a.work();//--->Animal.work();
		//ͳһι������
		//a.catchMouse();�ڸ������Ҳ���,����
		//�ڶ�̬�������,���Ƿ��ֲ���ֱ�ӵ�����������з���
		/*
			���Ƿ���ֻ�ܵ�����ӵ�еķ���
			��������ı������͵�Animal,ֻ��ȥAnimal����丸������ӵ�еĳ�Ա
			�����������еķ����ڸ����в�����,�����ڸ������Ҳ���
		*/
	}

	/*
	public void feed(Cat c) {
		System.out.println("...feed...");
		c.eat();
		c.catchMouse();
	}

	//�����������ֻ��ι��
	public void feed(Dog d) {
		System.out.println("...feed...");
		d.eat();
		d.watch();
	}*/
}

class Animal {
	Animal() {
		//this��ʾ���ǵ�ǰ����,ֻ����1��������
		System.out.println(this);
	}

	public static void work() {
		System.out.println("fu");
	}

	public void eat() {
		System.out.println("�Բ�");
	}
}

class Dog extends Animal {
	Dog() {
		
	}
	int i = 0;
	public static void work() {
		System.out.println("zi");
	}

	public void eat() {
		System.out.println("�Թ�ͷ");
	}

	public void watch() {
		System.out.println("ſ�ڵ��Ͽ���");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("����");
	}

	public void catchMouse() {
		System.out.println(".zzz.ץ����");
	}
}