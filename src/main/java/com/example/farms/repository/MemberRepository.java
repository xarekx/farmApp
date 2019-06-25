package com.example.farms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.farms.model.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member,Integer> {

}
