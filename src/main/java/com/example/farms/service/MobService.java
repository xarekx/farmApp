package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farms.model.Item;
import com.example.farms.model.Drop;
import com.example.farms.model.Mob;
import com.example.farms.repository.DropRepository;
import com.example.farms.repository.ItemRepository;
import com.example.farms.repository.MobRepository;

@Service
public class MobService {
	
	@Autowired
	MobRepository mobRepository;
	
	@Autowired
	ItemRepository itemRepository;

	public List<Mob> getAllMobs() {
		
		List<Mob> mobList = new ArrayList<>();
		
		mobRepository.findAll().forEach(mobList::add);
		
		return mobList;
	}

	public List<Item> getAllItemsByMobId(int id) {
		
		List<Item> lootList = new ArrayList<>();
		
		itemRepository.fetchItemsById(id).forEach(lootList::add);
		System.out.println(itemRepository.fetchItemsById(id));
		
		
		return lootList;
	}

}
