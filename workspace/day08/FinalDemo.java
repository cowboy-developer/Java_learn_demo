public class FinalDemo {
	public static void main(String[] args)	{
		//new Zi();
		//表示这个变量是最的终的,不允许修改
		//final修饰变量表示常量
		final int I = 10;//常量
		//错误: 无法为最终变量i分配值
		//I = 0;错误的
		//常量我的名字
		//常量标识符全部大写,单词间使用'_'
		final String MY_NAME = "易小星";

		final int[] ARR = {1,2,3};
		//可以修改
		ARR[0] = 0;
		//ARR重新指向其他对象
		//报错:ARR是常量,表示的是引用的地址不能变
		//ARR = new int[1];错误的
	}
}

class Fu {
	Fu() {
		//象征性做初始化
		work();
	}
	//由于这个方法特别重要,不允许修改
	public void work() {
		System.out.println("核心初始化");
	}
}

class Zi extends Fu {
	//重写父类的方法
	//错误: Zi中的work()无法覆盖Fu中的work()
	public void work() {
		System.out.println("黑客初始化");
	}
}
