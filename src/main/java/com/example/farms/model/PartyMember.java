package com.example.farms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Party_members")
public class PartyMember {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int memb_id;
	int pt_id;
	int u_id;
	
	public PartyMember() {
		
	}
	
	public PartyMember(int memb_id, int u_id) {
		super();
		this.memb_id = memb_id;
		this.u_id = u_id;		
	}
	
	public PartyMember(int memb_id, int pt_id, int u_id) {
		super();
		this.memb_id = memb_id;
		this.pt_id = pt_id;
		this.u_id = u_id;
	}
	
	public int getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(int memb_id) {
		this.memb_id = memb_id;
	}
	public int getPt_id() {
		return pt_id;
	}
	public void setPt_id(int pt_id) {
		this.pt_id = pt_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

}
