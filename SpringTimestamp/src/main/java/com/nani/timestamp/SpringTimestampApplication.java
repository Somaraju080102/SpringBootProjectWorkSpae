package com.nani.timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.timestamp.service.TimeServ;

@SpringBootApplication
public class SpringTimestampApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cont=	SpringApplication.run(SpringTimestampApplication.class, args);
		
		TimeServ ans=cont.getBean(TimeServ.class);
		
		ans.insertData();
		
		
		
	}

}
