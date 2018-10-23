package com.EurekaJdbcYj.service.impl;

import com.EurekaJdbcYj.dao.YjDao;
import com.EurekaJdbcYj.domain.Yj;
import com.EurekaJdbcYj.service.YjService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by caijun on 10/16/2018.
 */
@Service
public class YjServiceImpl implements YjService {

    @Autowired
    private YjDao yjDao;

    @Override
	public List<Yj> findCityByName(Long valid_flag) {
		// TODO Auto-generated method stub
		return yjDao.findByName(valid_flag);
	}

}