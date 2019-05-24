package com.example.farms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Loot {
	
	public Loot() {
		
	}

	@Id
	@GeneratedValue
	private String id;
	
	@Column(name="item_count")
	private int itemCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public Loot(String id, int itemCount) {
		super();
		this.id = id;
		this.itemCount = itemCount;
	}
	
	
	
	
}
