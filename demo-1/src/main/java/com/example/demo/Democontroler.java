package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroler {
@GetMapping("/")
@ResponseBody
public String home() {
	return"hi there welcome";
}
	@GetMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("temp", "Welcome to thymeleaf");
		return "NewFile";
		
	}
}
