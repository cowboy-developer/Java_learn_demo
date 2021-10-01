package com.$520it_02;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println(get());
	}
	
	public static int get() {
		int i = 0;
		try {
			//先执行return把值返回去,再执行finally
			//System.exit(0);
			return i;
		} finally {
			System.out.println(111);
		}
	}

	private static void work() {
		System.out.println("start");
		//核心代码
		//finall主要的作用是用于释放资源
		try {
//			InputStream is = new FileInputStream("c:/setup.exe");
			System.out.println("使用资源");
			int a = 1 / 0;
			//资源使用完毕后必须释放,不释放就会导致内存一直占用
//			is.close();//释放资源
		} catch (Exception e) {
			//象征处理
			System.out.println(e.getMessage());
		} finally {
			//在try中的代码无论是否有异常都会执行
			System.out.println("释放资源");
		}
		
		System.out.println("end");
	}
}
