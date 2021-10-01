//方法的覆盖/重写
public class OverrideDemo {
	public static void main(String[] args)	{
		//创建一只企鹅
		Penguin p = new Penguin();
		//调用企鹅飞的方法
		//发现企鹅飞起来了,但是实际上企鹅不会飞
		p.fly();
		//实际上的Penguin.work();
		p.work();
		//使用类名调用
	}
}

class Penguin extends Bird {
	//继承鸟类后,继承fly的方法,此时这个方法其实不适合子类的
	//方法的重写
	//返回值类型必须是父方法中返回值类型的子类或本身
	//访问权限必须更大或本身
	//方法签名必须一致
	//方法的重写有个前提,必须在继承的基础上
	/*
	@Override
	public void fly() {
		System.out.println("甩了几下翅膀发现飞不起来");
		//要你调用本能在父类上-->调用父类的方法
		//明确说明这个方法是父类的方法
		//super表示的是当前这个类的父类
		super.fly();//调用父类被覆盖的方法
		System.out.println(i);
	}
	*/

	Penguin(int i) {
		//默认没有写,第一行代码就是super();
		//对于构造方法来讲实际执行的第一个语句也一定是super();
		//如果父类没有无参构造,必须在构造方法的第一行使用super(参数)
		super(i);
	}

	Penguin() {
		//在同一个构造方法中不能同时出现this()和super()
		//super();//调用父类的无参构造
		this(0);
		//默认没有写,第一行代码就是super();
	}

	int i = 10;

	public void fly() {
		System.out.println("本类的i:" + i + ",父类的i:" + super.i);
	}

	public static void work() {
		System.out.println("sub");
	}
}

class Bird {
	int i = 0;
	public Bird(int i) {}

	public static void work() {
		System.out.println("super");
	}

	//鸟会飞
	public void fly() {
		System.out.println("...fly...");
	}
}
