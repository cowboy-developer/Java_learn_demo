public class SingleDemo {
	public static void main(String[] args)	{
		//需求:内存中只能有一个Single对象
		Single s1 = Single.getInstance();
		//System.out.println(s1);
		Single s2 = Single.getInstance();
		System.out.println(s2 == s1);//true
		s1.work();
	}
}

class Single {
	/*
		思考:要创建对象必须用到构造方法
			上面可以任意调用构造方法,原因是构造方法暴露的public
			构造方法私有后只有本类才能调用,必须本类创建对象
			成员变量私有后外部不能拿到对象
		解决:私有化构造方法
			使用成员变量保存本类对象,必须私有和静态
			提供一个公共的方法返回静态字段
	*/
	//1:私有化构造方法
	private Single() {}
	//2:使用成员变量保存本类对象
	private static Single s = new Single();
	//3:提供公共的方法,返回本类对象
	public static Single getInstance() {
		return s;
	}

	//后面省略N多的实例方法
	public void work() {}
}
