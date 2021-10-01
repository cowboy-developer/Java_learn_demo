public class IntWrapDemo {
	public static void main(String[] args)	{
		//测试
		//描述整数对象10
		IntWrap i1 = new IntWrap(10);
		//描述整数对象20
		IntWrap i2 = new IntWrap(20);
		//整数可以运算  *
		//拿到对象的值参与运算
		System.out.println(i1.intValue() * i2.intValue());
		//拿最大值和最小值
		System.out.println("int max:" + IntWrap.MAX_VALUE);
		System.out.println("int min:" + IntWrap.MIN_VALUE);
	}
}

//描述int类型
class IntWrap {
	//最大值/最小值
	public static final int MAX_VALUE = 2100000000;
	public static final int MIN_VALUE = -2100000000;

	private int i;	
	//使用构造方法包装int类型
	IntWrap(int i) {
		//保存为成员变量
		this.i = i;
	}

	//描述参与运行的行为
	public int intValue() {
		//返回内部保存的值
		return i;
	}
}
