package com.cwp.webservice.Interface;

/**
 * SEI（Service Endpoint Interface）接口
 * @author 叔公
 *
 */
public interface WeatherInterface {

	/**
	 * 查询天气
	 * @param cityName 城市名称
	 * @return 返回查询结果
	 */
	String queryWeather(String cityName);
}
