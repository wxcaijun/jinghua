package com.EurekaJdbcCity.service;

import com.EurekaJdbcCity.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}