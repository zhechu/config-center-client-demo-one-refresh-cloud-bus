package com.wise.server.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 * @author lingyuwang
 *
 */
@RestController
@RefreshScope // 支持配置刷新
public class HelloController {

	@Value("${application.name}")
	private String applicationName;
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
    public String hello() {
        return "你现在访问的是：" + applicationName;
    }

}
