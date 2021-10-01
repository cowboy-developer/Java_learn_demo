public class PersonDemo {
	public static void main(String[] args)	{
		/*
		//创建一个人类
		//Person p = new Person("王尼玛", new Gender('男'));
		Person p = new Person("王尼玛", Gender.MAN);
		System.out.println(p);
		//由于gender是char类型,只要是字符即可
		//由于Gender的构造方法没有私有,外部可以随意创建对象
		//p = new Person("任真天", new Gender('妖'));
		p = new Person("任真天", Gender.WOMAN);
		//我们人类性别只有男或女
		System.out.println(p);
		
		p = new Person("唐马儒", Gender.MAN);
		*/
		Gender g = Gender.WOMAN;
		//switch只支持整数
		switch (g) {
			//常量,对于枚举只写值
			case MAN:
				System.out.println("man");
				break;
			case WOMAN:
				System.out.println("woman");
				break;
			default:
		}
	}
}

//枚举实现接口,只能使用匿名内部类来重写
//定义了一个枚举类,这个类的父类是Enume
enum Gender implements A {
	//第一行必须写静态字段
	//枚举值后加(实参)表示调用构造方法
	//在后面加{}表示的是枚举类型的匿名内部类
	//枚举的值是固定的,外界不能再创建出枚举对象
	//如何重写枚举中的抽象方法,匿名内部类
	MAN('男') {
		//重写抽象方法
		public void work() {
			System.out.println("nan ... wrok");
		}
	},WOMAN('女') {
		//重写抽象方法
		public void work() {
			System.out.println("woman ... wrok");
		}
	};
	//类的成员必须写在静态字段后面
	private char gender;
	
	//必须私有
	Gender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return gender + "";
	}

	//abstract void work();
}

interface A {
	abstract void work();
}

/*
class Gender {
	private char gender;
	//提供静态字段,保证不被修改,使用final修饰
	public static final Gender MAN = new Gender('男');
	public static final Gender WOMAN = new Gender('女');

	private Gender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return gender + "";
	}
}
*/

class Person {
	private String name;
	//这个数据类型比较敏感不能乱,使用自定义类型
	//private char gender;
	//使用自定义的类型
	private Gender gender;

	Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
		/*
		if (gender == '男' || gender == '女') {
			this.gender = gender;
		} else {
			this.gender = '女';
		}
		*/
	}

	public String toString() {
		return "Person [name=" + name + ",gender=" + gender + "]";
	}
}
