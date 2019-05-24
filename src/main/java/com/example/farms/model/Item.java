package com.example.farms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Item {
	
	@Id
	int id_item;
	String name_item;
	int id_mob_drop;
	int id_zone_drop;
	
	public Item() {
		
	}
	
	public Item(int id_item, String name_item) {
		this.id_item = id_item;
		this.name_item = name_item;
	}
	
	public int getId_item() {
		return id_item;
	}
	public void setId_item(int id_item) {
		this.id_item = id_item;
	}
	public String getName_item() {
		return name_item;
	}
	public void setName_item(String name_item) {
		this.name_item = name_item;
	}
	public int getId_mob_drop() {
		return id_mob_drop;
	}
	public void setId_mob_drop(int id_mob_drop) {
		this.id_mob_drop = id_mob_drop;
	}
	public int getId_zone_drop() {
		return id_zone_drop;
	}
	public void setId_zone_drop(int id_zone_drop) {
		this.id_zone_drop = id_zone_drop;
	}
		
	

}
