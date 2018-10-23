package com.EurekaJdbcScs.service;

import com.EurekaJdbcScs.domain.Scs;

/**
 * 城市业务逻辑接口类
 *
 * Created by caijun on 10/16/2018.
 */
public interface ScsService {

    /**
     * 根据城市名称，查询城市信息
     * @param ScsId
     */
	Scs findScsById(String ScsId);
}