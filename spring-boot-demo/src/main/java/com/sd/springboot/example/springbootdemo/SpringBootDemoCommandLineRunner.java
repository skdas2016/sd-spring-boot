package com.sd.springboot.example.springbootdemo;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@SpringBootApplication
//@Component
//@Order(3)
public class SpringBootDemoCommandLineRunner implements CommandLineRunner {
	  

	

	@Override
	public void run(String... args) throws Exception {
		String strArgs = Arrays.stream(args).collect(Collectors.joining("|"));
		
		System.out.println("strArgs ... from CommandLineRunner " + strArgs);
	}
	   
	   

}
