package com.cwp.webservice.implement;

import javax.jws.WebService;

import com.cwp.webservice.Interface.WeatherInterface;

/**
 * SEI��Service Endpoint Interface���ӿڵ�ʵ����
 * 
 * @author �幫
 * 
 */
@WebService
// @WebService��ʾ������һ�������࣬��Ҫ�������е�public�ķ���
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client..." + cityName);
		String weather = "��";
		return weather;
	}

}
