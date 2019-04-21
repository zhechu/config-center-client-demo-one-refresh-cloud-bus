package com.wise.server.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

/**
 * 启动类
 * @author lingyuwang
 *
 */
@SpringBootApplication(scanBasePackages = "com.wise")
@EnableEurekaClient
@Slf4j
public class DemoOneServer {
    
    public static void main(String[] args) {
    	SpringApplication.run(DemoOneServer.class, args);
    }
    
    @Value("${server.port}")
    private String port;
    
    @PostConstruct
    public void finishInit(){
        log.info("Start {} with port:{}",DemoOneServer.class.getSimpleName(),port);
    }
    
}
