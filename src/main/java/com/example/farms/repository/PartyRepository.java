package com.example.farms.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Party;

@Repository
public interface PartyRepository extends CrudRepository<Party,Integer> {
	
	@Query("Select max(pt_id) from Party")
	public int fetchMaxIndex();
		

}
