package com.example.farms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.Mob;
import com.example.farms.service.MobService;

@RestController
@RequestMapping("/mobs")
public class MobController {
	
	@Autowired
	MobService mobService;

	@GetMapping("/all")
	public List<Mob> getAllMobs() {
		
		return mobService.getAllMobs();
	}
	
	@GetMapping("/{id}")
	public Mob getMob(@PathVariable int id) {	
		
		return mobService.getMob(id);
	}
	
	
	
}
