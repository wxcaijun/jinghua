package com.EurekaJdbcScs.controller;

import com.EurekaJdbcScs.domain.Scs;
import com.EurekaJdbcScs.service.ScsService;
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
public class ScsRestController {

    @Autowired
    private ScsService scsService;

    @RequestMapping(value = "/api/scs", method = RequestMethod.GET)
    public Scs findOneScs(@RequestParam(value = "scsId", required = true) String scsId) {
        return scsService.findScsById(scsId);
    }

}