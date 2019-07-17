package com.example.farms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mobs")
public class Mob {
	
	@Id @GeneratedValue
	int mob_id;
	String mob_name;
	int mob_zone_id;
	
	public Mob() {
		
	}
	
	public Mob(int mob_id, String mob_name, int mob_zone_id) {
		super();
		this.mob_id = mob_id;
		this.mob_name = mob_name;
		this.mob_zone_id = mob_zone_id;
	}
	public int getMob_id() {
		return mob_id;
	}
	public void setMob_id(int mob_id) {
		this.mob_id = mob_id;
	}
	public String getMob_name() {
		return mob_name;
	}
	public void setMob_name(String mob_name) {
		this.mob_name = mob_name;
	}
	public int getMob_zone_id() {
		return mob_zone_id;
	}
	public void setMob_zone_id(int mob_zone_id) {
		this.mob_zone_id = mob_zone_id;
	}

}
