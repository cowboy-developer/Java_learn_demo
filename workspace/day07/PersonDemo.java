public class PersonDemo {
	public static void main(String[] args)	{
		/*
		//创建一个Person对象
		Person p = new Person();
		//给Person成员变量赋值
		p.name = "王尼玛";
		p.age = 10;
		System.out.println("修改前:" + p.age);
		//发现年龄有误
		p.age = 8;		
		System.out.println("修改后:" + p.age);

		Person p2 = new Person();
		p2.name = "唐马儒";
		p2.age = 65;
		System.out.println("修改前:" + p2.age);
		//也去修改年龄
		//p2.age = -60;//根源-->设计不合理
		//System.out.println("修改后:" + p2.age);
		//以后修改年龄不要直接改,通过方法来改
		p2.setAge(60);
		System.out.println("修改后:" + p2.age);
		//此时前面的升级虽然从一定程度上解决了,但是根源问题没有解决
		p2.age = -40;//解决方案:不能让类外面修改类的成员变量
		System.out.println("修改后:" + p2.age);
		*/
		Person p = new Person();
		//Person@58e4d7f7  这个结果是Object的toString方法返回的
		System.out.println(p);
	}
}

class Person {
	String name;
	int age;
	//默认的类名@哈希码不满足我的需求
	@Override
	public String toString() {
		return "name=" + name + ",age=" + age;
	}
	//if(age < 0) {};
	//由于这些执行语句都是逻辑代码,必须放在方法中
	//这个方法的作用判断这个值是否合理
	public void setAge(int a) {
		//对赋值年龄做判断
		if (a > 0) {
			age = a;
			System.out.println("修改成功");
		} else {
			System.out.println("数据有误,请核对");
		}
	}
}
