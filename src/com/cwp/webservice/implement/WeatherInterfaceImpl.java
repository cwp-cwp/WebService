package com.cwp.webservice.implement;

import javax.jws.WebService;

import com.cwp.webservice.Interface.WeatherInterface;

/**
 * SEI（Service Endpoint Interface）接口的实现类
 * 
 * @author 叔公
 * 
 */
@WebService
// @WebService表示该类是一个服务类，需要发布其中的public的方法
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client..." + cityName);
		String weather = "晴";
		return weather;
	}

}
