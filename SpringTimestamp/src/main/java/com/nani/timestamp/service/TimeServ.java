package com.nani.timestamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nani.timestamp.entity.Product;
import com.nani.timestamp.repo.Timerepo;

@Component
public class TimeServ {
	
	@Autowired
	Timerepo timerepo;
	
	public void insertData() {
		Product pr=new Product();
		
		pr.setPname("Cocaine");
		pr.setPrice(1223.0);
		
		timerepo.save(pr);
		
		System.out.println("Product Saved succesfully");
		
	}

}
