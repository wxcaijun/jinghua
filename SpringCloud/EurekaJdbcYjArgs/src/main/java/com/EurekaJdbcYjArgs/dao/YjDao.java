package com.EurekaJdbcYjArgs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.EurekaJdbcYjArgs.domain.Yj;

/**
 * 城市 DAO 接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface YjDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
	List<Yj> findByName(@Param("valid_flag") Long valid_flag);	
}