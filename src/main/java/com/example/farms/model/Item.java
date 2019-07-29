package com.example.farms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Item {
	
	@Id
	int item_id;
	String item_name;
	int mob_id;
	
	public Item() {
		
	}
	
	public Item(int item_id,String item_name) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		
	}

	public Item(int item_id, String item_name, int mob_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.mob_id = mob_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getMob_id() {
		return mob_id;
	}

	public void setMob_id(int mob_id) {
		this.mob_id = mob_id;
	}
	
	
	
}
