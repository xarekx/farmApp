package com.example.farms.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Party")
public class Party {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int pt_id;
	String pt_name;
	Date pt_create_date;
	
	public Party() {
		
	}
	
	public int getParty_id() {
		return pt_id;
	}
	public void setParty_id(int party_id) {
		this.pt_id = party_id;
	}
	public String getParty_name() {
		return pt_name;
	}
	public void setParty_name(String party_name) {
		this.pt_name = party_name;
	}
	public Date getParty_date() {
		return pt_create_date;
	}
	public void setParty_date(Date pt_create_date) {
		this.pt_create_date = pt_create_date;
	}

}
