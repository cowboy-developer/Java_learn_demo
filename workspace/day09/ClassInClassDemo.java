public class ClassInClassDemo {
	public static void main(String[] args)	{
		System.out.println("Hello World!");
	}
}

class Out {
	private int i;
	//��Out���ж�����,���������ڲ���
	public void work() {
		final int NUM = 0;
		//�ڷ����ж������оֲ��ڲ���
		class In {
			//�ֲ��ڲ�����ʾֲ�����ֻ���ǳ���
			int a = NUM;
			//�������������ǳ����Ļ�,���������˱�������ʧ
			//���Ǵ�ʱ����ж��������,��һ��GC
			//����Ҫ��֤�ڶ���ʹ���ڼ����ݲ���ʧ,�����ǳ���
		}
	}

	//��̬�ڲ���
	//static class In {	}

	/*
	//�ڲ��������-->�ⲿ��$�ڲ���
	class In {
		public void show() {
			//�����ڲ��������ڲ�,���з���private�ı�׼
			System.out.println(i);
		}
	}
	*/
}
