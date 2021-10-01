public class OptDemo {
	public static void main(String[] args)	{
		//调用
		//System.out.println(getIntTime());//1毫秒
		System.out.println(getStringTime());//520
	}

	public static long getStringTime() {
		long start = System.currentTimeMillis();
		//做拼接1+...+1W
		String res = "";
		for (int i = 1; i <= 10000; i++) {
			res += i;
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	//设计一个方法计算1+1W所花的时间
	public static long getIntTime() {
		/*思路:
			1:先记录当前的时间
			static long currentTimeMillis() 
			2:1+...+10W
			3:再获取当前的时间
			4:返回时间差
		*/
		long start = System.currentTimeMillis();
		
		int res = 0;
		for (int i = 0; i <= 100000; i++) {
			res += i;
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
}


