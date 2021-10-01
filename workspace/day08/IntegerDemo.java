public class IntegerDemo {
	public static void main(String[] args)	{
		//演示Integer
		//1:创建对象
		Integer i1 = new Integer(10);
		//演示这个值的double形式
		//System.out.println(i1.doubleValue());
		//返回对象int类型的值
		System.out.println(i1.intValue());

		//掌握:
		//MAX_VALUE 最大值
		System.out.println(Integer.MAX_VALUE);
		//MIN_VALUE 最小值
		System.out.println(Integer.MIN_VALUE);

		//valueOf方法  返回整数对应的Integer对象
		Integer i2 = Integer.valueOf(100);
		//Integer重写的toString方法
		System.out.println(i2);//100

		//parseInt方法   把字符串类型的数字转变成int类型
		//我需要表示的是数字12+3
		//System.out.println("12" + 3);//123
		//NumberFormatException: For input string: "1a2"
		//这个方法只能转换纯数字
		//int num = Integer.parseInt("1a2");
		int num = Integer.parseInt("12");
		System.out.println(num + 3);//15

		//toBinaryString方法  转成二进制
		System.out.println(Integer.toBinaryString(3));
		//toOctalString方法   转八进制
		System.out.println(Integer.toOctalString(9));
		//toHexString方法     转16进制
		System.out.println(Integer.toHexString(15));
	}
}
