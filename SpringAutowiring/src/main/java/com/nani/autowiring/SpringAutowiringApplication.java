package com.nani.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.autowiring.robot.Robot;

@SpringBootApplication
public class SpringAutowiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAutowiringApplication.class, args);
		
		ConfigurableApplicationContext cont=SpringApplication.run(Robot.class, args);
		
		Robot obj=cont.getBean(Robot.class);
		
		obj.runChip();
		
	}

}
