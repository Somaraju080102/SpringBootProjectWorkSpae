package com.nani.trans.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.trans.entity.Address;
import com.nani.trans.entity.Employee;
import com.nani.trans.repo.AddrRepo;
import com.nani.trans.repo.EmpRepo;

@Service
public class TransServ {
	
	@Autowired
	EmpRepo empRepo;
	
	@Autowired
	AddrRepo addrRepo;
	
	public void saveData() {
		
		Employee e =new Employee();
		e.setEname("Somaraju");
		Employee saveRepo= empRepo.save(e);
		
		Address a=new Address();
		a.setEmpaddr("Srnail nagar");
		a.setEmpcity("Hyderabad");
		a.setEmpid(saveRepo.getEmpid());
		
		addrRepo.save(a);
		
		
		
	}
	
}
