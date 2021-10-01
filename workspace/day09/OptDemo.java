public class OptDemo {
	public static void main(String[] args)	{
		//����
		//System.out.println(getIntTime());//1����
		System.out.println(getStringTime());//520
	}

	public static long getStringTime() {
		long start = System.currentTimeMillis();
		//��ƴ��1+...+1W
		String res = "";
		for (int i = 1; i <= 10000; i++) {
			res += i;
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	//���һ����������1+1W������ʱ��
	public static long getIntTime() {
		/*˼·:
			1:�ȼ�¼��ǰ��ʱ��
			static long currentTimeMillis() 
			2:1+...+10W
			3:�ٻ�ȡ��ǰ��ʱ��
			4:����ʱ���
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


