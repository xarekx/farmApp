package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.exception.MobNotFoundException;
import com.example.farms.model.Mob;
import com.example.farms.repository.MobRepository;

@Service
public class MobService {

	@Autowired
	MobRepository mobRepository;
	
	public List<Mob> getAllMobs() {
		
		List<Mob> mobs = new ArrayList<>();
		mobRepository.findAll().forEach(mobs::add);
		
		return mobs;
	}

	public Mob getMob(int id) {
	
		return mobRepository.findById(id).orElseThrow(() -> new MobNotFoundException("Cannot find mob with given id: " + id));
	}

	
	
}
