package com.EurekaJdbcScs.dao;

import org.apache.ibatis.annotations.Param;
import  com.EurekaJdbcScs.domain.Scs;

/**
 * 供应商 DAO 接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface ScsDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param scsId 供应商编码
     */
	Scs findById(@Param("scsId") String scsId);
}