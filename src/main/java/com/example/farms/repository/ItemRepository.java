package com.example.farms.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {
	
	@Query("Select new com.example.farms.model.Item(i.item_id,i.item_name,i.mob_id) from Item i where mob_id=:mob_id")
	ArrayList<Item> fetchItemsById(@Param("mob_id") int mob_id);
	

}
