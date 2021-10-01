public class App {
	public static void main(String[] args)	{
		/*
		//��̬
		Animal a = new Cat();
		a.eat();//����
		a = new Dog();
		a.eat();//�Թ�ͷ
		*/
		//����
		Round r = new Round(10);
		//r.getLen();
		//r.getArea();

		Triangle t = new Triangle(3, 4, 5);
		//t.getLen();
		//t.getArea();
		test(r);
		test(t);
	}

	//����һ������ķ���
	/*
	public static void test(Round r) {}
	public static void test(Triangle t) {}
	ͳһ��Ƴ�һ����ͼ�񷽷�
	*/
	public static void test(Graph g) {
		g.getLen();
		g.getArea();
		//����: Graph�ǳ����; �޷�ʵ����
		new Graph();
	}
}

//��һ�������๫���Ķ����������
abstract class Graph {
	//��Щ�����ķ�����û������
	//����: �Ƿ������η����:abstract��private/static/final������
	//����private���κ����಻�ܼ̳�Ҳ�Ͳ�����д
	//����static��������,Ҳ��������Ϊ�ļ̳�
	//final�Ĳ��ܱ�������д,����ķ���ʧȥ������
	public abstract void getLen();
	public abstract void getArea();
}

//���������д�����ǳ��󷽷�,��������Ҳ�������ó���
class Triangle extends Graph {
	private int a;
	private int b;
	private int c;
	
	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void getLen() {
		System.out.println(a + b + c);
	}

	public void getArea() {
		System.out.println(a * b / 2);
	}
}

class Round extends Graph {
	private double r;
	
	public Round(double r) {
		this.r = r;
	}

	//�������ܳ������
	public void getLen() {
		//��ʽ
		System.out.println(2 * Math.PI * r);
	}

	public void getArea() {
		System.out.println(Math.PI * r * r);
	}
}

abstract class Animal {
	//�����������������������Զ�����Ϊ
	/*
	public void eat() {
		//���ڶ�������������һ������
		//���ܵ���д������Զ�������Ϊ
		//������û������--->û�����岻Ӧ�ô���
		System.out.println("..eat..");
	}
	*/
	//����: ȱ�ٷ�������, ����������
	public abstract void eat();//Ӧ��ʹ�ó���������
}

class Cat extends Animal {
	public void eat() {
		System.out.println("..eat ��..");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("..eat ��ͷ..");
	}
}
