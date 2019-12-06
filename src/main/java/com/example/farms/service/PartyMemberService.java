package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.model.Party;
import com.example.farms.model.PartyMember;
import com.example.farms.repository.PartyMemberRepository;
import com.example.farms.repository.PartyRepository;

@Service
public class PartyMemberService {
	
	@Autowired
	PartyMemberRepository partyMemberRepository;
	
	@Autowired
	PartyRepository partyRepository;

	public List<PartyMember> getAllPartyMembers() {
		
		List<PartyMember> partyMembers = new ArrayList<>();
		partyMemberRepository.findAll().forEach(partyMembers::add);
		
		return partyMembers;
	}

	public List<PartyMember> getAllPartyMembersById(int pt_id) {
		List<PartyMember> partyMembers = new ArrayList<>();
		
		partyMemberRepository.fetchMembersByPartyId(pt_id).forEach(partyMembers::add);;
		
		return partyMembers;
	}


}
