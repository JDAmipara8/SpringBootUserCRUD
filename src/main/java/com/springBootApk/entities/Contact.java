package com.springBootApk.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	private Long cId;
	
	private String email;
	private String cotactName;
	
	private Long uId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long cId, String email, String cotactName, Long uId) {
		super();
		this.cId = cId;
		this.email = email;
		this.cotactName = cotactName;
		this.uId = uId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCotactName() {
		return cotactName;
	}

	public void setCotactName(String cotactName) {
		this.cotactName = cotactName;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	
	
	
}
