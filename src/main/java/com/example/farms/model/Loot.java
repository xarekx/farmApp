package com.example.farms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Drops")
public class Loot {
	

	@Id @GeneratedValue
	private int drop_id;
	private int item_id;
	private int party_id;
	
	public int getDrop_id() {
		return drop_id;
	}
	public void setDrop_id(int drop_id) {
		this.drop_id = drop_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	
	public Loot() {
		
	}

	
	
}
