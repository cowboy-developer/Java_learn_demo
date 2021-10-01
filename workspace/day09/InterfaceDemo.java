public class InterfaceDemo {
	public static void main(String[] args)	{
		//创建一个人对象
		Person p = new Person();
		p.walk();
		//如果对象是符合某规范,我可以使用规范来声明对象类型
		//接口和实现类之间赋值也是属于多态,以后常见的是接口和实现类的关系
		IWalkable walkable = p;//多态
		walkable.walk();
		//接口不能实例化
		//new IWalkable();错误的
		IWalkable.I = 20;
	}
}

class Person implements IWalkable {
	//实现接口必须实现里面是抽象方法,否则该类也是抽象类
	@Override
	public void walk() {
		System.out.println("在陆地走");
	}
}

//定义一个走路的规范
interface IWalkable {
	//上面不能赋值说明是final,能类名调用是static
	int I = 10;//-->public static final int I = 10;
	//定义走的行为,不关心实现
	//接口的方法不能有主体
	//public void walk() {} 错误的
	//接口的方法修饰符是固定的,有冲突报错
	void walk();//-->public abstract void walk();

}
