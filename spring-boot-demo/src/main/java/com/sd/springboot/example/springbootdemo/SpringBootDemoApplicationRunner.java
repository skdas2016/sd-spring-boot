package com.sd.springboot.example.springbootdemo;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@SpringBootApplication
//@Order(2)
//@Component
public class SpringBootDemoApplicationRunner implements ApplicationRunner {
	  

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String strArgs = Arrays.stream(args.getSourceArgs()).collect(Collectors.joining("|"));
		
		System.out.println("strArgs ... from ApplicationRunner" + strArgs);
		
	}
	   
	   

}
