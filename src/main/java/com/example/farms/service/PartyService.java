package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.model.Party;
import com.example.farms.repository.PartyRepository;

@Service
public class PartyService {
	
	@Autowired
	PartyRepository partyRepository;

	public List<Party> getAllPartyId() {
		
		List<Party> partyListId = new ArrayList<>();
		partyRepository.findAll().forEach(partyListId::add);
		
		return partyListId;
	}
	
	

}
