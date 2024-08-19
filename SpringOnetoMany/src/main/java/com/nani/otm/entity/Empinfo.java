package com.nani.otm.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Empinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	private String ename;
	
	private Double esalary;
	 
	@OneToMany(mappedBy = "empinfo" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 private List<EmpAddr> addrs;
	
	
	

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

	public List<EmpAddr> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<EmpAddr> addrs) {
		this.addrs = addrs;
	}
	
	

}
