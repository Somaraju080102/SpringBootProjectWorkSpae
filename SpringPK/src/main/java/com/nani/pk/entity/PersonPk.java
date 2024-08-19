package com.nani.pk.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {
	
	private Integer personId;
	
	private String passportNo;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	
	

}
