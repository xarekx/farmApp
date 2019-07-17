package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Mob;

@Repository
public interface MobRepository extends CrudRepository<Mob,Integer> {

}
