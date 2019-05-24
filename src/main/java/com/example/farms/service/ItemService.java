package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.exception.ItemNotFoundException;
import com.example.farms.model.Item;
import com.example.farms.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		
		List<Item> items = new ArrayList<>(); 
		
		itemRepository.findAll().forEach(items::add);
		
		return items;
	}

	public Item getItem(int id) {
		
		return itemRepository.findById(id)
				.orElseThrow(() -> new ItemNotFoundException("Cannot find item with given id" + id));
	}

}
