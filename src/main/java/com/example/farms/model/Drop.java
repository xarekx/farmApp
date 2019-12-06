package com.example.farms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Drops")
public class Drop {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drop_id;
	private int item_id;
	private int pt_id;
	private int quantity;
	
	public Drop() {
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
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
		return pt_id;
	}
	public void setParty_id(int party_id) {
		this.pt_id = party_id;
	}
	
	

	
	
}
