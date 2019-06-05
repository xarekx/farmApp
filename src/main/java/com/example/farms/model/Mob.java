package com.example.farms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mobs")
public class Mob {
	
	@Id
	int id_mob;
	String name_mob;
	int id_mob_land;
	

	public Mob() {
		
	}
	
	public int getId_mob() {
		return id_mob;
	}
	public void setId_mob(int id_mob) {
		this.id_mob = id_mob;
	}
	public String getName_mob() {
		return name_mob;
	}
	public void setName_mob(String name_mob) {
		this.name_mob = name_mob;
	}
	public int getId_mob_land() {
		return id_mob_land;
	}

	public void setId_mob_land(int id_mob_land) {
		this.id_mob_land = id_mob_land;
	}

	

}
