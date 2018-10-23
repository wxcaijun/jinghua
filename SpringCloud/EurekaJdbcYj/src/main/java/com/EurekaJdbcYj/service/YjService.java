package com.EurekaJdbcYj.service;

import java.util.List;

import com.EurekaJdbcYj.domain.Yj;

/**
 * 城市业务逻辑接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface YjService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
	List<Yj> findCityByName(Long valid_flag);
}