package com.springBootApk.entities;
import com.springBootApk.entities.Contact;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class User {

	@Id
	@GeneratedValue //To autoGenerat value
	private long uId;
	
	private String uName;
	private String city;

	
	private List<Contact> contact;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long uId, String uName, String city, List<Contact> contact) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.city = city;
		this.contact = contact;
	}

	public User(long uId, String uName, String city) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.city = city;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	

	
	
	
	
}
