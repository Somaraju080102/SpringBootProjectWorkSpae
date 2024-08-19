package com.nani.oto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.oto.serv.PassportServ;

@SpringBootApplication
public class SpringOnetoOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont= SpringApplication.run(SpringOnetoOneApplication.class, args);
		
		PassportServ obj=cont.getBean(PassportServ.class);
		
		obj.getData();
		
	}

}
