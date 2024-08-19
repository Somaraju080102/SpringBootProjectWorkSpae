package com.nani.pk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.pk.entity.Person;
import com.nani.pk.entity.PersonPk;
import com.nani.pk.repo.PassRepo;

@Service
public class PassServ {
	
	@Autowired
	PassRepo passRepo;
	
	
	public void getData() {

		PersonPk pk=new PersonPk();
		pk.setPassportNo("JUA1234A");
		pk.setPersonId(10221);
		
	  Optional<Person> oclass=passRepo.findById(pk);
	  
	  if(oclass.isPresent()) {
		  Person obj=oclass.get();
		  
		  System.out.println(obj.toString());
		  
	  }
	  else {
		  System.out.println("Please enter proper details");
	  }
		
		
	}
	
	public void saveData() {
		
		PersonPk pk=new PersonPk();
		pk.setPassportNo("JUA1234A");
		pk.setPersonId(10221);
		
		Person obj=new Person();
		
		obj.setAge(22);
		obj.setName("Somaraju");
		obj.setPk(pk);
		
		passRepo.save(obj);
		System.out.println("Data inserted to table");
		
	}

}
