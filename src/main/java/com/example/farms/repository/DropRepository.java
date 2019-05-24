package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.farms.model.Loot;

public interface DropRepository extends CrudRepository<Loot,String> {

}
