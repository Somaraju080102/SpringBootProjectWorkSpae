package com.nani.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nani.bookstore.service.BookService;

@SpringBootApplication
public class SpringBookStoreApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext cont= SpringApplication.run(SpringBookStoreApplication.class, args);
		 
		 
		
	}

}
