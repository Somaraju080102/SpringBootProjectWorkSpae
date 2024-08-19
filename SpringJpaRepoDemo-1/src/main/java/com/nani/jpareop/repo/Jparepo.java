package com.nani.jpareop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nani.jpareop.entity.Employee;

@Repository
public interface Jparepo extends JpaRepository<Employee, Integer> {

	
}
