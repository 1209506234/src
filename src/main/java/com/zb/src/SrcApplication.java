package com.zb.src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//服务注册中心
public class SrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrcApplication.class, args);
    }

}
