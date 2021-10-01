package com.seemygo.feiq.pojo;

/**
 * 专门封装要发送的数据
 * @author 逍遥
 *
 */
public class Data {
	private String ip;
	private String data;
	
	public Data(String ip, String data) {
		super();
		this.ip = ip;
		this.data = data;
	}

	public Data() {
		super();
	}

	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
