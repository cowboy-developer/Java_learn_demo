public class NoNameClassDemo {
	public static void main(String[] args)	{
		/*
		Dog d = new Dog();
		//以上只使用1次这个Dog类
		


		*/
		//匿名内部类,使用时会马上创建匿名内部类的对象
		//IWalkable() {}整体,这个整体是匿名内部类
		//new IWalkable() {}这个整体是一个对象
		work(new IWalkable() {
			//重写抽象的方法
			public void walk() {
				System.out.println("...1walk1...");
			}
		});

		new Dog() {};
	}

	public static void work(IWalkable walk) {
		walk.walk();	
	}
}

class Dog implements IWalkable {
	public void walk() {
		System.out.println("...walk...");
	}
}

interface IWalkable {
	void walk();
}