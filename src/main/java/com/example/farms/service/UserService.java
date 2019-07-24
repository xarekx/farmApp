package com.example.farms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.farms.model.User;
import com.example.farms.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		
		List<User> userList = new ArrayList<>();
		
		userRepository.findAll().forEach(userList::add);
		
		return userList;
	}

}
