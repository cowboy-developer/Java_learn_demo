public abstract class TemlClass {
	//模板方法
	//这个方法只能被调用,不能被重写,使用final修饰
	public final long getTime() {
		long start = System.currentTimeMillis();
		//核心逻辑
		work();

		long end = System.currentTimeMillis();
		return end - start;
	}
	//这个方法被外界调用是没有意义的
	//这个方法存在是专门给子类重写的
	protected abstract void work();
}

//写一个类继承这个模板类,重写核心方法work
class StringOpt extends TemlClass {
	protected void work() {
		//拼接1+..+1W
		String res = "";
		for (int i = 0; i <= 10000; i++) {
			res += i;
		}
	}
}

class IntOpt extends TemlClass {
	protected void work() {
		//数字1+..+1W
		int res = 0;
		for (int i = 0; i <= 100000; i++) {
			res += i;
		}
	}
}
