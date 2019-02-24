package com.sd.springboot.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@RestController
public class SpringBootWebApplication extends SpringBootServletInitializer {
	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootWebApplication.class);
	   }
	   public static void main(String[] args) {
	      SpringApplication.run(SpringBootWebApplication.class, args);
	   }
	   
	   @RequestMapping(value = "/")
	   public String hello() {
	      return "This is war file web app";
	   }

}
