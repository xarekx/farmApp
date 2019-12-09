package com.example.farms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.PartyMember;
import com.example.farms.service.PartyMemberService;

@RestController
@RequestMapping("/partymembers")
public class PartyMemberController {
	
	@Autowired
	PartyMemberService partyMemberService;
	
	@GetMapping(path="/all")
	public List<PartyMember> getallPartyMembers() {
		
		
		return partyMemberService.getAllPartyMembers();
	}
	
	@GetMapping(path="/members/{pt_id}")
	public List<PartyMember> getAllPartyMemberByPartyId(@PathVariable int pt_id) {
		
		return partyMemberService.getAllPartyMembersById(pt_id);
	}
	
	@PostMapping(path="/members/add")
	public void addMembers(@RequestBody PartyMember partyMember) {
		
		
		partyMemberService.saveMember(partyMember);
		
	}

}
