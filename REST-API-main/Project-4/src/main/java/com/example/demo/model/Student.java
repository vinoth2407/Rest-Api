package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int id;
	private String Studentname;
	private String Departmentname;
	private String mailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Studentname;
	}
	public void setName(String Studentname) {
		this.Studentname = Studentname;
	}
	public String getAge() {
		return Departmentname;
	}
	public void setAge(String Departmentname) {
		this.Departmentname = Departmentname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Studentname=" + Studentname + ", Departmentname=" + Departmentname + ",mailid=" + mailid +"]";
	}
	
}
