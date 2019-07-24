package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {
	
	@Id
	private int empid;
	
	private String empname;
	
	private String empdesign;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesign() {
		return empdesign;
	}
	public void setEmpdesign(String empdesign) {
		this.empdesign = empdesign;
	}
	
	
	
	

}
