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
	int party_id;
	String party_name;
	Date party_date;
	String member_id;
	
	public Party() {
		
	}
	
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public Date getParty_date() {
		return party_date;
	}
	public void setParty_date(Date party_date) {
		this.party_date = party_date;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	

}
