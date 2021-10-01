public class NoNameObj {
	public static void main(String[] args)	{
		//演示匿名对象
		//没有变量接收,匿名对象
		//只能使用1次
		new Person().show();
		//上面这个Person对象在使用1次后变成了垃圾对象
		//我要使用方法,必须传人一个数组
		//里面使用的就是匿名对象
		String info = java.util.Arrays.toString(new int[] {1,2,3});
		System.out.println(info);
	}
}

class Person {
	String name;
	int age;

	public void show() {
		System.out.println("...do show...");
	}
}
