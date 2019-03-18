package com.cwp.webservice.server;

import javax.xml.ws.Endpoint;

import com.cwp.webservice.implement.WeatherInterfaceImpl;
/**
 * 天气服务端
 * @author 叔公
 *
 */
public class WeatherServer {
	
	/**
	 * 执行 main() 方法之后，浏览器访问 http://127.0.0.1:12345/weather?wsdl
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Endpoint发布服务
		 * 参数解释
		 * 1.address - 服务地址
		 * 2.implementor - 实现类
		 */
		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
		System.out.println("服务发布成功...");
	}
}
