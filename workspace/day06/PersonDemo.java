public class PersonDemo {
	public static void main(String[] args) {
		//根据类型创建对象
		//语法:数据类型 变量名 = 对象(new 数据类型);
		//创建一个Person类型的对象,使用变量p1来接收
		Person p1 = new Person();
		//操作对象  操作对象的方法
		//调用对象的做节目的方法
		//语法:对象.方法();
		p1.show();//p1代表的对象做节目
		//调用对象的挣钱方法
		p1.makeMoney();//p1代表的对象挣钱
		
		//每次new都会创建一个新的对象
		Person p2 = new Person();
		//上面是p1代表的对象做事,跟p2没有关系的
		//给p2对象的name赋值
		p2.name = "王尼玛";
		//访问下p2对象的name值
		//语法:对象.成员变量
		System.out.println("p2.name=" + p2.name);
		//p1和p2不是同一个对象,相互之间没有关系
		p1.name = "唐马儒";
		System.out.println("p1.name=" + p1.name);
		
		//Person@181ec6b9  类名@哈希码
		System.out.println(p1);
		//内存地址不相同说明不是同一个对象
		System.out.println(p1 == p2);
		
	}
}

//使用类来描述人类对象
class Person {//用成员变量和方法描述好对象后,模板就完成
	//成员变量-->描述状态
	String name;//描述姓名
	int age;//描述年龄

	//方法-->描述行为
	public void show() {//描述做节目
		System.out.println("...do show...");
	}

	public void makeMoney() {//描述挣钱
		System.out.println("...make money...");
	}
}