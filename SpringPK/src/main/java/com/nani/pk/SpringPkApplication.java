package com.nani.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.pk.service.PassServ;

@SpringBootApplication
public class SpringPkApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext cont=	SpringApplication.run(SpringPkApplication.class, args);
	 
	 PassServ data=cont.getBean(PassServ.class);
	 
//	 data.saveData();
	 
	data.getData();
	
	}

}
