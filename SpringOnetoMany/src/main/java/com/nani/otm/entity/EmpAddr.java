package com.nani.otm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class EmpAddr {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	
	private String acity;
	
	private String astate;
	
	private String atype;
	
	@Override
	public String toString() {
		return "EmpAddr [aid=" + aid + ", acity=" + acity + ", astate=" + astate + ", atype=" + atype + "]";
	}

	@ManyToOne
	@JoinColumn(name = "eid")
	private Empinfo empinfo;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAcity() {
		return acity;
	}

	public void setAcity(String acity) {
		this.acity = acity;
	}

	public String getAstate() {
		return astate;
	}

	public void setAstate(String astate) {
		this.astate = astate;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public Empinfo getEmpinfo() {
		return empinfo;
	}

	public void setEmpinfo(Empinfo empinfo) {
		this.empinfo = empinfo;
	}
	
	
	

}
