public class VarDemo {
	public static void main(String[] args)	{
		String name = null;
		int i = 0;//这个区域3-9,作用域是4-9
		if (i == 1) {
			int j = 1;//这个区域6-8,作用域的6-8
			i = 10;
		}
		int j = 10;
	}
}
