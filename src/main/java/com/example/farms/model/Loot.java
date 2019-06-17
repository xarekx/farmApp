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
	private int id_drop;
	private int id_item;
	private int id_party;
	private int item_count;
	
	public int getId_drop() {
		return id_drop;
	}


	public void setId_drop(int id_drop) {
		this.id_drop = id_drop;
	}


	public int getId_item() {
		return id_item;
	}


	public void setId_item(int id_item) {
		this.id_item = id_item;
	}


	public int getItem_count() {
		return item_count;
	}


	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}


	public int getId_party() {
		return id_party;
	}


	public void setId_party(int id_party) {
		this.id_party = id_party;
	}
	
//	public Loot(int id_item, int id_party, int item_count) {
////		super();
//		this.id_item = id_item;
//		this.id_party = id_party;
//		this.item_count = item_count;
//	}


	public Loot() {
		
	}
	
	
	
	
}
