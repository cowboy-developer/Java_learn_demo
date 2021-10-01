package com.$520it_04;

public class Tick implements Runnable {
	//��1000��Ʊ
	private int tick = 1000;

	/*@Override
	public void run() {
		//ʹ��ͬ���ķ���,�����ڷ����ϼ�synchronized
		//ͬ���ķ���ͬʱֻ����1���߳�ִ������Ĵ���
		try {
			while (true) {
				if(work()) {
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	//һ������ͬ���ķ������Ƚ���ʹ��,ͬ������������this
	private synchronized boolean work() throws Exception {
		if (tick > 0) {
			tick--;
			String name = Thread.currentThread().getName();
			Thread.sleep(2);
			System.out.println(name + "������1��ʣ��" + tick);
			return false;
		} else {
			return true;
		}
	}
	
	
	
	@Override
	public void run() {
		try {
			//��Ʊ
			while (true) {
				//�����в���������Դ�Ĵ��붼Ҫͬ��
				//����tick���ǹ�����Դ,������tick�ľ�Ҫͬ��
				//synchronized(ͬ����������)
				//���뱣֤ͬ���ļ�������ʼ����ͬһ������
//				synchronized (new Object()) {
				synchronized (Tick.class) {
					if (tick > 0) {
						//��Ʊ-->��
						tick--;
						String name = Thread.currentThread().getName();
						Thread.sleep(2);
						System.out.println(name + "������1��ʣ��" + tick);
					} else {
						//û��Ʊ��
						return;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
