public class StaticDemo {
	public static void main(String[] args)	{
		//创建一个人类
		Person p1 = new Person("安全纯二狼", "日本");
		//由于这个方法是static表示是人类切腹
		//Person.killSelf();
		//这个方法不是静态的了,个体行为
		p1.killSelf();
	}
}

class Person {
	//如果这个名字设置成静态,所有人的名字都一样
	String name;
	String country;//不该设置成静态

	Person(String n, String c) {
		name = n;
		country = c;
	}

	//切腹,设计不合理
	//public static void killSelf() {
	//属于对象,个体行为
	public void killSelf() {
		System.out.println(name + "切腹自尽,很光荣");
	}
}
