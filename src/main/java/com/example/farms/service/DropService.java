package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.farms.model.Loot;
import com.example.farms.repository.DropRepository;

@Service
public class DropService {
	
	@Autowired
	DropRepository dropRepository;
	
	
	public List<Loot> getAllDrops() {
		
		List<Loot> drop = new ArrayList<>();
		dropRepository.findAll().forEach(drop::add);	
		
		return drop;
	}

	public List<String> getDropsByPartyId(int id) {
		
		return dropRepository.findDropsById(id);
	}

	public void saveDrops(List<Loot> loot) {
		
		List<Loot> loots = new ArrayList<>();
		loots.addAll(loot);
		dropRepository.saveAll(loots);
		
	}
	

}
