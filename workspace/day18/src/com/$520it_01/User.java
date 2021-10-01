package com.$520it_01;

public class User {
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		//�洢��ϣ��ʱ���Ȼ�ȡ����Ĺ�ϣ��
		//��ϣ����ͬ�ٵ���equals�����ж�
		//ѭ�����ϣ�붼����ͬ������Ԫ�ش���
		int code = 31 * 10;
		System.out.println(code);
		return code;
	}
	
	@Override
	public boolean equals(Object obj) {
		//������������䶼һ��,��Ϊ��ͬһ������
		//�ڹ�ϣ��ͬʹ�û����equals,����true,˵��Ԫ���ظ���
		//ѭ����equals������false,˵��Ԫ�ز��ظ�,����
		User u = (User) obj;
		return name.equals(u.name) && age == u.age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public User() {
		super();
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
