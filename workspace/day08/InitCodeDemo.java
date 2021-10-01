public class InitCodeDemo {
	public static void main(String[] args)	{
		new Animal();
		new Animal();
		new Animal();
	}
}

class Animal {
	static String name;
	//使用static修饰的构造代码块,静态代码块
	static {
		//其作用的专门初始化静态的成员变量
		//只执行1次,JVM加载class时就会自动执行
		System.out.println("静态代码块");
	}
	int i;	
	Animal() {
		//构造方法的作用是初始化对象,static修饰的不属于对象
		//name = "";
		i = 10;
		System.out.println("Object");
	}

	//构造代码块
	{
		//构造代码块先执行
		System.out.println("init");
	}

	public static void work() {
		System.out.println("fu");
	}

	public void eat() {
		System.out.println("吃草");
	}
}