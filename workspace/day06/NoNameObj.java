public class NoNameObj {
	public static void main(String[] args)	{
		//��ʾ��������
		//û�б�������,��������
		//ֻ��ʹ��1��
		new Person().show();
		//�������Person������ʹ��1�κ�������������
		//��Ҫʹ�÷���,���봫��һ������
		//����ʹ�õľ�����������
		String info = java.util.Arrays.toString(new int[] {1,2,3});
		System.out.println(info);
	}
}

class Person {
	String name;
	int age;

	public void show() {
		System.out.println("...do show...");
	}
}
