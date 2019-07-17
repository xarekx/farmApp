package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.model.Mob;
import com.example.farms.repository.MobRepository;

@Service
public class MobService {
	
	@Autowired
	MobRepository mobRepository;

	public List<Mob> getAllMobs() {
		
		List<Mob> mobList = new ArrayList<>();
		
		mobRepository.findAll().forEach(mobList::add);
		
		return mobList;
	}

}
