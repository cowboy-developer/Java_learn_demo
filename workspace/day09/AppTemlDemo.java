public class AppTemlDemo {
	public static void main(String[] args)	{
		TemlClass teml = new IntOpt();//∂‡Ã¨
		System.out.println(teml.getTime());
		teml = new StringOpt();
		System.out.println(teml.getTime());
		teml.work();
	}
}
