package com.nani.otm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.otm.serv.EmpInfoServ;

@SpringBootApplication
public class SpringOnetoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont= SpringApplication.run(SpringOnetoManyApplication.class, args);
		
		EmpInfoServ obj=cont.getBean(EmpInfoServ.class);
//		obj.saveData();
		obj.getData();
		
	}

}
