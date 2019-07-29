package com.example.farms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.farms.model.Item;
import com.example.farms.service.ItemService;

@RestController
@RequestMapping(path="/items")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping(path="/all")
	public List<Item> getAllItems() {
		
		return itemService.getAllItems();
	}
	
	@GetMapping(path="/{id}")
	public Item getItem(@PathVariable int id) {
		
		return itemService.getItem(id);
	}

		
	
}
