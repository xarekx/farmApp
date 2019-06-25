package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {
	

}
