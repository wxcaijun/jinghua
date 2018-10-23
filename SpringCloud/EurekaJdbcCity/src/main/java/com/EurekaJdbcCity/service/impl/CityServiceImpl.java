package com.EurekaJdbcCity.service.impl;

import com.EurekaJdbcCity.dao.CityDao;
import com.EurekaJdbcCity.domain.City;
import com.EurekaJdbcCity.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by caijun on 10/16/2018.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}