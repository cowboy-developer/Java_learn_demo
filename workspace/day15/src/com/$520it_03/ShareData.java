package com.$520it_03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareData {
	private String name;
	private String taste;
	
	//��׼����˭�ȴ�
	private boolean flag;
	//true->������->�����ߵȴ�,��֮�����ߵȴ�
	//ʹ��������
	private Lock lock = new ReentrantLock();
	//����ͬ����������
	private Condition con = lock.newCondition();
	
	public void add(String name, String taste) {
		try {
			//����һ��ʼ������
			lock.lock();
			if (flag) {
				//����Condition�������
				con.await();
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("������" + name + ",��ζ��" + taste);
			//�ı���
			flag = true;
			//������ɺ���������
			//������ͬ�������������
			con.signalAll();
		} catch (Exception e) {
		} finally {
			//�ͷ���
			lock.unlock();
		}
	}
	
	public void show() {
		try {
			lock.lock();
			if (!flag) {
				//������ͬ������������õȴ��ķ���
				con.await();
			}
			
			Thread.sleep(10);
			System.out.println("�����˲���:" + name + ",��ζ:" + taste);
			//�ı���
			flag = false;
			//������ɻ���������
			//������ͬ�������������
			con.signalAll();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
}
