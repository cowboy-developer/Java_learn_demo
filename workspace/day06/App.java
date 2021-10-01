public class App {
	public static void main(String[] args)	{
		//创建3个学生对象
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		//给3个学生起名字
		s1.name = "王尼玛";
		s2.name = "任真天";
		s3.name = "易小星";
		
		//王尼玛交费
		s1.fees();
		//里面的元素全都是Student类型,所有数组是Student[]
		Student[] stus = {s1, s2, s3};

		//查看交费前的结果
		for (Student s : stus) {
			System.out.println(s.name + ":" + s.fee);
		}

		//遍历数组,找出没有交费的学生交费
		for (Student s : stus) {
			//这里是s代表的就是每一个元素
			if (!s.fee) {//没有交费的才执行交费
				//有条件执行,没有交费才执行
				s.fees();
			}
		}

		//查看交费后的结果
		for (Student s : stus) {
			System.out.println(s.name + ":" + s.fee);
		}
	}
}

//这里不是内部类,类和类之间是不嵌套的
class Student {
	/*
		构造方法名称和类名完全一致
		没有返回值类型这项
		可以写return,但是不能有值
	*/
	Student() {
		System.out.println("对象创建了");
		//return 0x11111;不能有值返回
	}

	//描述姓名和交费
	String name;
	boolean fee;//t:已交 f:未交

	//描述交费行为
	public void fees() {
		//交费逻辑
		fee = true;
		System.out.println(name + "交费");
	}
}
