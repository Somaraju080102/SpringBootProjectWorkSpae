package com.nani.trans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.trans.serv.TransServ;

@SpringBootApplication
public class SpringTransactiomApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext cont=	SpringApplication.run(SpringTransactiomApplication.class, args);
	  
	  TransServ data=cont.getBean(TransServ.class);
	  
	  data.saveData();
	  
	}

}
