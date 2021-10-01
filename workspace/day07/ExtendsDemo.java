//演示继承
public class ExtendsDemo {
	public static void main(String[] args)	{
		//创建一条狗
		Dog d = new Dog();
		//调用狗吃东西的方法
		//由于这个方法在父类中是public所有自动继承
		d.eat();
		d.sleep();

		d.name = "旺财";
		System.out.println(d.name);
	}
}

//狗是特殊的动物,狗继承动物
//由于Dog继承了Animal,Animal继承了Object,Dog类也是间接继承Object
class Dog extends Animal {
	//这个类就继承了Animal中的部分成员
	//public和protected可以继承
	//缺省的在同包下也可以继承
	//私有的不能继承
}

//class Animal//这个类没有显示继承,默认继承java.lang.Object
//上下两行代码是等价的
class Animal extends Object//,java.util.Arrays错误,只能直接继承一个类
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
