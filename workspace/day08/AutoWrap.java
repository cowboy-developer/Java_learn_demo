public class AutoWrap {
	public static void main(String[] args)	{
		/*
		//演示自动的装箱和拆箱
		//把基本类型的值直接赋值给包装类,自动装箱
		//这个特征只有基本类型和它对应的包装类可以使用
		Integer i1 = 10;//自动装箱
		//把包装类的值直接赋值给基本类型,自动拆箱
		int num = i1;//自动拆箱
		*/
		//通过自动装箱-->valueOf方法
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//true

		i1 = 127;
		i2 = 127;
		System.out.println(i1 == i2);//true

		i1 = 128;
		i2 = 128;
		System.out.println(i1 == i2);//false
	}
}
