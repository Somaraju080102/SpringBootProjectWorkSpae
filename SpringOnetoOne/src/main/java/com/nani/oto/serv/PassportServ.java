package com.nani.oto.serv;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.oto.entity.Passinfo;
import com.nani.oto.entity.Passperson;
import com.nani.oto.repo.PassRepo;
import com.nani.oto.repo.PersonRepo;

@Service
public class PassportServ {
	
	@Autowired
	PersonRepo personRepo;
	
	@Autowired
	PassRepo passRepo;
	
	
	
	public void getData() {
		Optional<Passperson>obj= personRepo.findById(1);
		
		if(obj.isPresent()) {
		Passperson data= obj.get();
		  System.out.println(data.toString());
		
		}
		else{
			System.out.println("Sorrey requested data not available");
		}
		
	}
	public void saveData() {
		
		Passperson pp =new Passperson();
		
		pp.setPersonname("Somaraju");		
		Passinfo pi =new Passinfo();
		
		pi.setPassportno("12ADVE2F");
		pi.setPassexpiry(LocalDate.now().plusYears(10));
		
		pi.setPassperson(pp);
		
		pp.setPassinfo(pi);
		
		personRepo.save(pp);
		
		System.out.println("Data saved succesfully");
		
	}
	


}
