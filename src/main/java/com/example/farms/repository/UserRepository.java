package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.farms.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
