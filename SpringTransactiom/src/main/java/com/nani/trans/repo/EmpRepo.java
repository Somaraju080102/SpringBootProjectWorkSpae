package com.nani.trans.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.trans.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	

}
