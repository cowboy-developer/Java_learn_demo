public class ConstructorDemo {
	public static void main(String[] args)	{
		//演示构造器
		Person p1 = new Person();
		//有了对象后再给对象赋值
		p1.name = "易小星";
		p1.age = 1;
		System.out.println(p1.name + ":" + p1.age);
		//我希望对象一出现就有值
		//根据参数调用构造方法
		Person p2 = new Person("王尼玛");
		System.out.println(p2.name + ":" + p2.age);
		Person p3 = new Person("赵铁柱", 30);
		System.out.println(p1.name + ":" + p1.age);
		System.out.println(p2.name);
		//使用构造方法创建对象时要注意,只能调用存在的构造方法
		//new Person(13);//匿名对象
		//人们进步,仅仅代表某个对象进步
		Person.lvUp();//表示整个进步
		Person.lvUp();//表示整个进步
		//我们现在遇到的问题是某类事物,而是单一的个体
		/*
			p1.lvUp();
			p2.lvUp();
			p3.lvUp();
		*/
		System.out.println(p1.civilized + ":" 
			+ p2.civilized + ":" + p3.civilized);
		//王尼玛的儿子出生了
		Person p4 = new Person("王尼妹", 0);
		//设计合理吗
		//表面上p4.civilized,是使用对象调用,但是东西是静态的不属于对象
		//所以编译器帮我纠正,使用类名调用p4.civilized--->Person.civilized
		System.out.println(p4.name + ":" + p4.civilized);
	}
}

class Person {
	String name;
	int age;
	//加上static后表示属于所有Person对象
	static int civilized;//描述人类的文明

	//没有构造方法,但是会默认有一个
	Person() {} //作用是初始化对象的信息
	//由于写了构造方法后没有了默认构造
	Person(String n) {//对象一创建就有值
		name = n;
	}
	//希望对象出现有名字和年龄
	Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//属于类
	public static void lvUp() {//文明进步
		civilized++;
		System.out.println("会用新的工具了,等级提升");
	}

	public void show() {
		System.out.println("...do show..." + civilized);
	}

	public void makeMoney() {
		System.out.println("...make money...");
	}
}
