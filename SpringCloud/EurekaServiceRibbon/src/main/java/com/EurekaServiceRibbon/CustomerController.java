package com.EurekaServiceRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	@Autowired
    HelloService service;
 
    @RequestMapping("/")
    public String consumer() {
        return service.helloService();
    }

}
