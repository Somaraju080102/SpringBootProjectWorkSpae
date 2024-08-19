package com.nani.validation.entity;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;

@Component
public class FormUser {
	
	@NotNull(message = "Enter Your Name")
	private String name;
	
	@NotNull(message = "Enter Your Email")
	private String email;
	
	@NotNull(message = "Enter Your Phn NO")
	private Long phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	

}
