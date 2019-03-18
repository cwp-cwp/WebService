package com.cwp.webservice.server;

import javax.xml.ws.Endpoint;

import com.cwp.webservice.implement.WeatherInterfaceImpl;
/**
 * ���������
 * @author �幫
 *
 */
public class WeatherServer {
	
	/**
	 * ִ�� main() ����֮����������� http://127.0.0.1:12345/weather?wsdl
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Endpoint��������
		 * ��������
		 * 1.address - �����ַ
		 * 2.implementor - ʵ����
		 */
		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
		System.out.println("���񷢲��ɹ�...");
	}
}
