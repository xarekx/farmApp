package com.example.farms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Drop;

@Repository
public interface DropRepository extends CrudRepository<Drop,Integer> {
	
	@Query(value = "SELECT i.item_name from Drops d left join Items i on d.item_id = i.item_id where d.pt_id = :id", 
			nativeQuery = true)
	  List<String> findDropsById(@Param("id") int id);
	
	

}
