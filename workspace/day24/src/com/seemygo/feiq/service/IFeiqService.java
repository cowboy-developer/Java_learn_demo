package com.seemygo.feiq.service;

import com.seemygo.feiq.pojo.Data;

/**
 * ΪfeiQ�����ṩ��������
 * �����ݷ���
 * �����ݵķ���
 */
public interface IFeiqService {
	/**
	 * �������ݵķ���
	 * @param data Ҫ���͵�����
	 */
	void send(final Data data);
	
	/**
	 * �������ݵķ���
	 */
	void accept();
}
