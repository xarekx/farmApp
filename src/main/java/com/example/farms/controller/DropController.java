package com.example.farms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.Drop;
import com.example.farms.service.DropService;

@RestController
@RequestMapping("/drops")
public class DropController {
	
	@Autowired
	DropService dropService;
	
	
	@GetMapping("/all")
	public @ResponseBody List<Drop> getAllDrops() {
		
		return dropService.getAllDrops();
	}
	
	@GetMapping("/{id}")
	public List<String> getDropsByPartyId(@PathVariable int id) {
		
		return dropService.getDropsByPartyId(id);
	}
	
	@PostMapping("/add")
	public void saveDrops(@RequestBody List<Drop> loot) {
		
		dropService.saveDrops(loot);
		
	}
	

}
	

