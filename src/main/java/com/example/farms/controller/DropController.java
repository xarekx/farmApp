package com.example.farms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.Loot;
import com.example.farms.service.DropService;

@RestController
@RequestMapping("/drops")
public class DropController {
	
	@Autowired
	DropService dropService;
	
	
	@GetMapping("/all")
	public @ResponseBody List<Loot> getAllDrops() {
		
		return dropService.getAllDrops();
	}
	
}
