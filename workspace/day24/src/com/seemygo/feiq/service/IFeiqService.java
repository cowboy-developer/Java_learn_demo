package com.seemygo.feiq.service;

import com.seemygo.feiq.pojo.Data;

/**
 * 为feiQ程序提供两个服务
 * 发数据服务
 * 收数据的服务
 */
public interface IFeiqService {
	/**
	 * 发送数据的方法
	 * @param data 要发送的数据
	 */
	void send(final Data data);
	
	/**
	 * 接收数据的方法
	 */
	void accept();
}
