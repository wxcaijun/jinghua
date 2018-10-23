package com.EurekaJdbcScs.service.impl;

import com.EurekaJdbcScs.dao.ScsDao;
import com.EurekaJdbcScs.domain.Scs;
import com.EurekaJdbcScs.service.ScsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by caijun on 10/16/2018.
 */
@Service
public class ScsServiceImpl implements ScsService {

    @Autowired
    private ScsDao scsDao;

    public Scs findScsById(String scsId) {
        return scsDao.findById(scsId);
    }

}