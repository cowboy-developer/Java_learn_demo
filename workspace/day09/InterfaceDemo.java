public class InterfaceDemo {
	public static void main(String[] args)	{
		//����һ���˶���
		Person p = new Person();
		p.walk();
		//��������Ƿ���ĳ�淶,�ҿ���ʹ�ù淶��������������
		//�ӿں�ʵ����֮�丳ֵҲ�����ڶ�̬,�Ժ󳣼����ǽӿں�ʵ����Ĺ�ϵ
		IWalkable walkable = p;//��̬
		walkable.walk();
		//�ӿڲ���ʵ����
		//new IWalkable();�����
		IWalkable.I = 20;
	}
}

class Person implements IWalkable {
	//ʵ�ֽӿڱ���ʵ�������ǳ��󷽷�,�������Ҳ�ǳ�����
	@Override
	public void walk() {
		System.out.println("��½����");
	}
}

//����һ����·�Ĺ淶
interface IWalkable {
	//���治�ܸ�ֵ˵����final,������������static
	int I = 10;//-->public static final int I = 10;
	//�����ߵ���Ϊ,������ʵ��
	//�ӿڵķ�������������
	//public void walk() {} �����
	//�ӿڵķ������η��ǹ̶���,�г�ͻ����
	void walk();//-->public abstract void walk();

}
