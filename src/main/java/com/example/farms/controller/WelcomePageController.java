package com.example.farms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

	@GetMapping(path="/")
	public String indexPage() {
		
		return "Welcome at farmApp page!";
	}
}
