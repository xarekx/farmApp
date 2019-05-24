package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.farms.model.Item;

public interface ItemRepository extends CrudRepository<Item,Integer> {
	

}
