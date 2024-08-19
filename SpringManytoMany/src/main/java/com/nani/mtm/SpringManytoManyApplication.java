package com.nani.mtm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.mtm.serv.UserRoleServ;

@SpringBootApplication
public class SpringManytoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont= SpringApplication.run(SpringManytoManyApplication.class, args);
		
		UserRoleServ obj=cont.getBean(UserRoleServ.class);
		
		obj.getData();
		
	}

}
