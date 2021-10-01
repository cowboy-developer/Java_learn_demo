public class ClassInClassDemo {
	public static void main(String[] args)	{
		System.out.println("Hello World!");
	}
}

class Out {
	private int i;
	//在Out内中定义类,这个类就是内部类
	public void work() {
		final int NUM = 0;
		//在方法中定义的类叫局部内部类
		class In {
			//局部内部类访问局部变量只能是常量
			int a = NUM;
			//如果这个变量不是常量的话,方法结束了变量就消失
			//但是此时如果有对象存在是,不一定GC
			//必须要保证在对象使用期间数据不消失,必须是常量
		}
	}

	//静态内部类
	//static class In {	}

	/*
	//内部类的名字-->外部类$内部类
	class In {
		public void show() {
			//由于内部类在类内部,所有符合private的标准
			System.out.println(i);
		}
	}
	*/
}
