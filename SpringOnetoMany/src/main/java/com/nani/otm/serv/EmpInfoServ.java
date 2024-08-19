package com.nani.otm.serv;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.otm.entity.EmpAddr;
import com.nani.otm.entity.Empinfo;
import com.nani.otm.repo.EmpAddrRepo;
import com.nani.otm.repo.EmpInfoRepo;

@Service
public class EmpInfoServ {
	
	@Autowired
	EmpAddrRepo addrRepo;
	
	@Autowired
	EmpInfoRepo infoRepo;
	
	
	public void getData() {
		Optional<Empinfo> empinfoOptional=infoRepo.findById(1);
		
		if(empinfoOptional.isPresent()) {
			
			 Empinfo obj= empinfoOptional.get();
			 
			 List<EmpAddr> elist=obj.getAddrs();
			 
			 elist.forEach(data->System.out.println(data.toString()));
		}
	}
	
	
	public void saveData() {
		
		Empinfo e1=new Empinfo();
		
		e1.setEname("Soma");
		e1.setEsalary(10000.0);
		
		EmpAddr a1=new EmpAddr();
		
		a1.setAcity("Hyd");
		a1.setAstate("TG");
		a1.setAtype("Permnanent");
		
        EmpAddr a2=new EmpAddr();
		
		a2.setAcity("Chennai");
		a2.setAstate("TN");
		a2.setAtype("Rent");
		
		
		a1.setEmpinfo(e1);
		a2.setEmpinfo(e1);
		
		e1.setAddrs(Arrays.asList(a1,a2));
				
		infoRepo.save(e1);
		
		

		System.out.println("Data saved succesfully");
		
	}

}
