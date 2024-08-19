package com.nani.jpareop.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.nani.jpareop.entity.Employee;
import com.nani.jpareop.repo.Jparepo;

@Component
public class JparepoService {
	
	Jparepo jparepo;
	
	public JparepoService(Jparepo jparepo) {
		this.jparepo=jparepo;
	}
	
	public void GetDataByAsc() {
		
		org.springframework.data.domain.Sort desc= org.springframework.data.domain.Sort.by("esalary").ascending();
		
		List<Employee>li=jparepo.findAll(desc);
		
		
		li.forEach(data->System.out.println(data.toString()));
	}
	
	public void getDataByPag() {
		int pagesize=3;
		int pageno=0;
		PageRequest	pg=PageRequest.of(pageno, pagesize);
		
		Page<Employee> emp=jparepo.findAll(pg);
		
		List<Employee> data=emp.getContent();
		data.forEach(val->System.out.println(val.toString()));
		
	}
	
	public void getDataByQuery() {
		Employee emp=new Employee();
		emp.setEname("soma");
		
	 Example<Employee>	exmp= Example.of(emp);
	 
	 List<Employee> data=jparepo.findAll(exmp);
	 data.forEach(ans->System.out.println(ans));
	 
	 
	}
	public void Insertdata() {
		Employee obj3=new Employee(103,"venkat",40000);
		Employee obj4=new Employee(104,"varma",50000);
		Employee obj5=new Employee(105,"abdul",10000);
		Employee obj6=new Employee(106,"jesus",30000);
		List<Employee> li=Arrays.asList(obj3,obj4,obj5,obj6 );
		
		
		jparepo.saveAll(li);
		

	}
	

}
