package com.nani.oto.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pasportid;
	
	private String passportno;
	
	private LocalDate passexpiry;
	
	@OneToOne
	@JoinColumn(name = "pass_id")
	private Passperson passperson;

	public Integer getPasportid() {
		return pasportid;
	}

	public void setPasportid(Integer pasportid) {
		this.pasportid = pasportid;
	}

	public String getPassportno() {
		return passportno;
	}

	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}

	public LocalDate getPassexpiry() {
		return passexpiry;
	}

	public void setPassexpiry(LocalDate passexpiry) {
		this.passexpiry = passexpiry;
	}

	public Passperson getPassperson() {
		return passperson;
	}

	public void setPassperson(Passperson passperson) {
		this.passperson = passperson;
	}
	
	

}
