package com.nani.jpareop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.jpareop.service.JparepoService;

@SpringBootApplication
public class SpringJpaRepoDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont= SpringApplication.run(SpringJpaRepoDemo1Application.class, args);
		
		JparepoService service=cont.getBean(JparepoService.class);
		
//		service.Insertdata();
		
//		service.GetDataByAsc();
//		service.getDataByPag();
		service.getDataByQuery();
	}
	

}
