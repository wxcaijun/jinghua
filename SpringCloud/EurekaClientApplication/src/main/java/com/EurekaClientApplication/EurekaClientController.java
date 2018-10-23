package com.EurekaClientApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class EurekaClientController {
	@RequestMapping("/info")
    public String testA() {
        return "hello I am is service A"; //测试代码直接返回一个字符串，不再调用service层等等。
    }

}
