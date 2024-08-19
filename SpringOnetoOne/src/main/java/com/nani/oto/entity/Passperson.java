package com.nani.oto.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passperson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personid;
	
	private String personname;
	
	@OneToOne( mappedBy = "passperson" ,cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	private Passinfo passinfo;

	public Integer getPersonid() {
		return personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public Passinfo getPassinfo() {
		return passinfo;
	}

	public void setPassinfo(Passinfo passinfo) {
		this.passinfo = passinfo;
	}

	@Override
	public String toString() {
		return "Passperson [personid=" + personid + ", personname=" + personname + "]";
	}
	
	
	

}
