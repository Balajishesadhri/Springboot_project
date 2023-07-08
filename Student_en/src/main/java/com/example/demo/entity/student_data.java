package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student_save")
public class student_data {
@Id
@GeneratedValue
	@Column(name="id")
private String id;

	public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

	@Column(name="idt")
	private String idt;
	
@Column(name="idn")

	private String idn;


@Column(name="Name")
	 private String Name;
@Column(name="Gender")
	 private String Gender;
@Column(name="Rel")
	
	 private String Rel;
@Column(name="CitizenShip")
	 private String CitizenShip;

@Column(name="Dob")
	 private String Dob;

@Column(name="Cardtype")
	 private String Cardtype;

@Column(name="Expire")
	 private String Expire;

@Column(name="Doi")
	 private String Doi;
	 
	 
	@Override
	public String toString() {
		return "student_data [id=" + id + ", idt=" + idt + ", idn=" + idn + ", Name=" + Name + ", Gender=" + Gender
				+ ", Rel=" + Rel + ", CitizenShip=" + CitizenShip + ", Dob=" + Dob + ", Cardtype=" + Cardtype
				+ ", Expire=" + Expire + ", Doi=" + Doi + "]";
	}
	public String getIdt() {
		return idt;
	}
	public void setIdt(String idt) {
		this.idt = idt;
	}
	public String getIdn() {
		return idn;
	}
	public void setIdn(String idn) {
		this.idn = idn;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getGender1() {
		return Gender;
	}
	public void setGender1(String gender1) {
		Gender = gender1;
	}
	public String getRel() {
		return Rel;
	}
	public void setRel(String rel) {
		Rel = rel;
	}
	public String getCitizenShip() {
		return CitizenShip;
	}
	public void setCitizenShip(String citizenShip) {
		CitizenShip = citizenShip;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getCardtype() {
		return Cardtype;
	}
	public void setCardtype(String cardtype) {
		Cardtype = cardtype;
	}
	public String getExpire() {
		return Expire;
	}
	public void setExpire(String expire) {
		Expire = expire;
	}
	public String getDoi() {
		return Doi;
	}
	
	public void setDoi(String doi) {
		Doi = doi;
	}
	
	
}
