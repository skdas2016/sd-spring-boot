package com.sd.springboot.example.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootDemoApplication {
	
	@Value("${spring.application.name}")
	   private String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	
	/*
	 * @RequestMapping(value = "/") public String hello() { return
	 * "spring.application.name " + name; }
	 */
	
	
	/*
	 * @Configuration public static class SecurityPermitAllConfig extends
	 * WebSecurityConfigurerAdapter {
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().anyRequest().permitAll() .and().csrf().disable(); }
	 * }
	 */
	
	


}
