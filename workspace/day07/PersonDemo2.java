//演示封装
public class PersonDemo2 {
	public static void main(String[] args)	{
		//this不是静态的
		//this.main(null);
		//创建一个Person对象
		Person p1 = new Person();
		//给Person成员变量赋值
		/*	由于使用private修饰,外界不能访问
			p.name = "王尼玛";
			p.age = 10;
		
			System.out.println("修改前:" + p.age);
			//发现年龄有误
			p.age = 8;		
			System.out.println("修改后:" + p.age);
		*/
		//设置操作调用setter方法
		p1.setName("王尼玛");
		p1.setAge(10);
		//获取值调用getter方法
		System.out.println(p1.getName() + ":" + p1.getAge());

		Person p2 = new Person();
		
		p2.setName("唐马儒");
		p2.setAge(20);
		
		System.out.println(p2.getName() + ":" + p2.getAge());

		Person p3 = new Person("任真天");
		System.out.println(p3.getName() + ":" + p3.getAge());
	}
}

//封装
class Person {
	//成员变量不能被外界直接访问
	private String name;
	private int age;
	
	public Person() {
		//System.out.println();
		//对this调用重载构造方法必须是构造器中的第一个语句
		this(null, 0);//不操作传默认值
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		//在构造方法中使用this表示调用重载的构造方法
		//this.name = name;
		//this();
		this(name, 0);//对于不操作的变量使用默认值
	}


	//由于使用private外界不能访问
	//发现方法在类内部,方法可以访问
	//提供方法,让外界通过操作方法,来操作成员变量

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		//对赋值年龄做判断
		if (age > 0) {
			this.age = age;
			System.out.println("修改成功");
		} else {
			System.out.println("数据有误,请核对");
		}
		//默认调用实例方法的对象是this,也就是说在类的内部调用可以省略this
		System.out.println("我的名字是" + getName());
	}

	//提供getter方法
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
