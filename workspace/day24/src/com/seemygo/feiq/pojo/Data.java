package com.seemygo.feiq.pojo;

/**
 * ר�ŷ�װҪ���͵�����
 * @author ��ң
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
