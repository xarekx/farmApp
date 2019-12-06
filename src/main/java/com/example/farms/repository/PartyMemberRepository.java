package com.example.farms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.farms.model.PartyMember;


@Repository
public interface PartyMemberRepository extends CrudRepository<PartyMember,Integer> {

	@Query("Select new com.example.farms.model.PartyMember(memb.id,memb.pt_id,memb.u_id) from PartyMember memb where memb.pt_id =:pt_id")
	ArrayList<PartyMember> fetchMembersByPartyId(@Param("pt_id") int pt_id);
	
	
}