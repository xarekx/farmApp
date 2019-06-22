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
	
	public Item() {
		
	}
	
	public Item(int item_id, String item_name) {
		this.item_id = item_id;
		this.item_name = item_name;
	}
	
	public int getId_item() {
		return item_id;
	}
	public void setId_item(int item_id) {
		this.item_id = item_id;
	}
	public String getName_item() {
		return item_name;
	}
	public void setName_item(String item_name) {
		this.item_name = item_name;
	}
	
}
