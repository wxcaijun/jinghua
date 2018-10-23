package com.EurekaJdbcYjArgs.controller;

import com.EurekaJdbcYjArgs.domain.Yj;
import com.EurekaJdbcYjArgs.service.YjService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caijun on 10/16/2018.
 */
@RestController
public class YjRestController {

    @Autowired
    private YjService yjService;

    @RequestMapping(value = "/api/yj", method = RequestMethod.GET)
    public List<Yj> findOneCity(@RequestParam(value = "valid_flag", required = false) Long valid_flag) { 
    //public List<Yj> findOneCity(@RequestParam(defaultValue="1") Long valid_flag) {
		return yjService.findCityByName(valid_flag);
	}

}