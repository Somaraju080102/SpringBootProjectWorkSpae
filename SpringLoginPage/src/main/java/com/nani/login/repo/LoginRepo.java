package com.nani.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.login.entity.LoginUser;

public interface LoginRepo extends JpaRepository<LoginUser, Integer> {
	
	public LoginUser findByEmailAndPassword(String email,String password);
	
	public LoginUser findByEmail(String email);
	
	
	

}
