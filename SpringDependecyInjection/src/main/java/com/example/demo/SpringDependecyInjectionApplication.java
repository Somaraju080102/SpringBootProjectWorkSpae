package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.service.UserService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.dao","com.example.demo.service"})
public class SpringDependecyInjectionApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext obj=  SpringApplication.run(SpringDependecyInjectionApplication.class, args);
		System.out.println("Hello World");
		
	
		UserService ans=obj.getBean(UserService.class);
		
		ans.findService(100);
		
		
	}

}
