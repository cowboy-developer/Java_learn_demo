package com.$520it_05;

public class OOPApp {
	public static void main(String[] args) {
		/*//打印出一个人的信息 name age gender ...
//		String name = "王尼玛";
//		int age = 26;
//		char gender = '男';
//		System.out.println("姓名是:" + name + " ...");
//		name = "唐马儒";
//		age = 30;
//		gender = '男';
//		System.out.println("姓名是:" + name + " ...");
		//根据Person类(模板),创建一个Person对象
		Person p = new Person();//0xa
		//操作对象的成员  变量
//		赋值       变量 = 对象
		p.name = "王尼玛";//说明name来自p对象
//		获取值      使用变量名
		System.out.println(p.name);//说明name来自p对象
		
		p.age = 26;
		System.out.println(p.age);
		//封装字段到类,通过创建对象来访问字段
		p = null;//0xa上的对象就是垃圾对象
*/	
		//表示使用无参构造来初始化对象
//		Person p = new Person();//Person类中没有无参构造
		//通过传人参数调用有参构造
		Person p = new Person("任真天");
		p.i = 10;// ---> Person.i = 10;
	}
}

//根据对象的特征抽象出类型
class Person {
	//构造方法
//	没有写有一个默认的构造方法
	Person() {}
//	如果自己写了构造方法就没有默认的了
	Person(String name) {
		this.name = name;
	}
	
	static int i;
	
	String name;
	int age;
	char gender;
	
	public void show() {
		System.out.println("...show...");
	}

	public void makeMoney() {
		System.out.println("...in money...");
	}
}
