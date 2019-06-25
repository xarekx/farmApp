package com.example.farms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.Party;
import com.example.farms.service.PartyService;



@RestController
@RequestMapping("/party")
public class PartyController {
	
	@Autowired
	PartyService partyService;
	
	@GetMapping("/all")
	public List<Party> getAllPartyId() {
		
		return partyService.getAllPartyId();
	}
	
	@GetMapping("/{id}")
	public Party getPartyById(@PathVariable int id) {
		
		return partyService.getPartyById(id);
	}
	
	@PostMapping("/party")
	public void addParty(@RequestBody Party party) {
		
		partyService.saveParty(party);
		
		
	}
 
}
