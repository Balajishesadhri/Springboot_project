package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

	
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
}
