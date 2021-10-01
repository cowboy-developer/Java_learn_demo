public abstract class TemlClass {
	//ģ�巽��
	//�������ֻ�ܱ�����,���ܱ���д,ʹ��final����
	public final long getTime() {
		long start = System.currentTimeMillis();
		//�����߼�
		work();

		long end = System.currentTimeMillis();
		return end - start;
	}
	//�����������������û�������
	//�������������ר�Ÿ�������д��
	protected abstract void work();
}

//дһ����̳����ģ����,��д���ķ���work
class StringOpt extends TemlClass {
	protected void work() {
		//ƴ��1+..+1W
		String res = "";
		for (int i = 0; i <= 10000; i++) {
			res += i;
		}
	}
}

class IntOpt extends TemlClass {
	protected void work() {
		//����1+..+1W
		int res = 0;
		for (int i = 0; i <= 100000; i++) {
			res += i;
		}
	}
}
