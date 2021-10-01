public class AppDemo {
	public static void main(String[] args)	{
		/*
		//此时这个Cat有几种类型
		//Cat属于Cat类型,Cat也属于Animal的类型
		Cat c = new Cat();//猫对象属于猫的类型
		//编译类型 : 运行类型
		Animal a = new Cat();//猫对属于动物的类型
		//多态
		//在运行程序时,真正起作用的是对象,也就是说这里执行的是Cat的eat方法
		a.eat();
		//Dog d = new Dog();
		//d.eat();
		//由于Cat类型和Dog类型没有继承关系
		//d = new Cat();
		//狗继承了动物,属于动物的类型
		a = new Dog();
		a.eat();
		
		Person p = new Person();
		Dog d = new Dog();
		//喂养
		p.feed(d);
		//再养一只猫
		Cat c = new Cat();
		p.feed(c);

		Animal a = new Dog();
		//a.i表示的是去Animal中找i
		System.out.println(a.i);//10
		*/
		new Dog();
	}
}

class Person {
	//由于我的方法限定得太死了,只能喂养特点的动物
	//发现这些动物都继承一个父类,Animal要是所有的动物都当做Animal来看待
	public void feed(Animal a) {
		System.out.println("...feed...");
		a.eat();
		//多态下,要想调用到子类特有的方法(强转)
		//应该如何正确强转,如果是猫转成猫,如果是狗转成狗
		if (a instanceof Cat) {
			//代码来到这里说明这个对象的猫
			Cat c = (Cat) a;//转成猫
			c.catchMouse();
		} else {
			//代码来到这里说明这个对象是狗
			Dog d = (Dog) a;
			d.watch();
		}

		//System.out.println("" instanceof Animal);//错误的使用
		/*
		//第一次的狗,还原成狗
		但是第二次传的是猫,所有转换报错
		ClassCastException: Cat cannot be cast to Dog猫不能转换成狗
		Dog d = (Dog) a;
		//强转后编译类型是Dog,去Dog中找watch方法
		d.watch();
		//
		*/

		//work方法是静态的,使用的是变量所代表是类来调用
		//a.work();//--->Animal.work();
		//统一喂养动物
		//a.catchMouse();在父类中找不到,报错
		//在多态的情况下,我们发现不能直接调用子类的特有方法
		/*
			我们发现只能掉父类拥有的方法
			由于这里的编译类型的Animal,只会去Animal类和其父类找其拥有的成员
			但是子类特有的方法在父类中不存在,所有在父类中找不到
		*/
	}

	/*
	public void feed(Cat c) {
		System.out.println("...feed...");
		c.eat();
		c.catchMouse();
	}

	//由于这个方法只能喂狗
	public void feed(Dog d) {
		System.out.println("...feed...");
		d.eat();
		d.watch();
	}*/
}

class Animal {
	Animal() {
		//this表示的是当前对象,只创建1个狗对象
		System.out.println(this);
	}

	public static void work() {
		System.out.println("fu");
	}

	public void eat() {
		System.out.println("吃草");
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
		System.out.println("吃骨头");
	}

	public void watch() {
		System.out.println("趴在地上看门");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
	}

	public void catchMouse() {
		System.out.println(".zzz.抓到了");
	}
}