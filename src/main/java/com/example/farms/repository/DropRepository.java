package com.example.farms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.farms.model.Loot;

public interface DropRepository extends CrudRepository<Loot,Integer> {
	
	@Query(value = "SELECT name_item from Drops d Join Items i on d.id_item = i.id_item join party p on d.id_party_farm = p.id_party_farm where p.id_party_farm =:id", nativeQuery = true)
	  List<String> findDropsById(@Param("id") int id);
	
	

}
