package com.cwp.webservice.Interface;

/**
 * SEI��Service Endpoint Interface���ӿ�
 * @author �幫
 *
 */
public interface WeatherInterface {

	/**
	 * ��ѯ����
	 * @param cityName ��������
	 * @return ���ز�ѯ���
	 */
	String queryWeather(String cityName);
}
