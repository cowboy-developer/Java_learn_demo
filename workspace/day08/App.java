public class App {
	public static void main(String[] args)	{
		/*
		//多态
		Animal a = new Cat();
		a.eat();//吃鱼
		a = new Dog();
		a.eat();//吃骨头
		*/
		//解题
		Round r = new Round(10);
		//r.getLen();
		//r.getArea();

		Triangle t = new Triangle(3, 4, 5);
		//t.getLen();
		//t.getArea();
		test(r);
		test(t);
	}

	//定义一个解题的方法
	/*
	public static void test(Round r) {}
	public static void test(Triangle t) {}
	统一设计出一个解图像方法
	*/
	public static void test(Graph g) {
		g.getLen();
		g.getArea();
		//错误: Graph是抽象的; 无法实例化
		new Graph();
	}
}

//把一下两个类公共的东西抽象出来
abstract class Graph {
	//这些方法的方法体没有意义
	//错误: 非法的修饰符组合:abstract和private/static/final有世仇
	//由于private修饰后子类不能继承也就不能重写
	//由于static的属于类,也不存在所为的继承
	//final的不能被子类重写,抽象的方法失去了意义
	public abstract void getLen();
	public abstract void getArea();
}

//子类必须重写所有是抽象方法,否则子类也必须设置抽象
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

	//可以求周长和面积
	public void getLen() {
		//公式
		System.out.println(2 * Math.PI * r);
	}

	public void getArea() {
		System.out.println(Math.PI * r * r);
	}
}

abstract class Animal {
	//这个方法的作用是描述动物吃东西行为
	/*
	public void eat() {
		//由于动物这类事物是一个概述
		//不能单纯写死动物吃东西的行为
		//方法体没有意义--->没有意义不应该存在
		System.out.println("..eat..");
	}
	*/
	//错误: 缺少方法主体, 或声明抽象
	public abstract void eat();//应该使用抽象来修饰
}

class Cat extends Animal {
	public void eat() {
		System.out.println("..eat 鱼..");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("..eat 骨头..");
	}
}
