package com.main.page.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Baby {
	@Id
	private int id;
	private String babyFirstName;
	private String babyLastName;
	private String fatherName;
	private String motherName;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabyLastName() {
		return babyLastName;
	}
	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Baby [id=" + id + ", babyFirstName=" + babyFirstName + ", babyLastName=" + babyLastName
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", address=" + address + "]";
	}
	
	
}
