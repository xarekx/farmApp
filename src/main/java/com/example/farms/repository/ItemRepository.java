package com.example.farms.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getAllItems(String dropParam) {
		List<String> allItems = new ArrayList<>();
		System.out.println(dropParam);
		if(dropParam.contentEquals("booro")) {
		allItems.addAll(jdbcTemplate.queryForList("SELECT ItemName FROM Booro_Items; ",String.class));
		} else if (dropParam.contentEquals("bowl")) {
			allItems.addAll(jdbcTemplate.queryForList("SELECT ItemName FROM Bowl_items;",String.class));
		}
		
		
		return allItems;
	}

}
