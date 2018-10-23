package com.EurekaJdbcCity.dao;

import org.apache.ibatis.annotations.Param;
import  com.EurekaJdbcCity.domain.City;

/**
 * 城市 DAO 接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}