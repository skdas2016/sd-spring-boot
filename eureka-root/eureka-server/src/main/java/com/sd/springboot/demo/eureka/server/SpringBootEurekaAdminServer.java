package com.sd.springboot.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaAdminServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaAdminServer.class, args);
    }
}