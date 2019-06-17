package com.example.farms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.farms.model.Loot;

public interface DropRepository extends CrudRepository<Loot,Integer> {
	
	@Query(value = "Select name_item from Items i join Drops d on i.id_item = d.id_item where id_party IN (:id)", 
			nativeQuery = true)
	  List<String> findDropsById(@Param("id") int id);
	
	

}
