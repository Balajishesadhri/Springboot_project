package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.student_data;
import com.example.demo.servise.re_student;

@Controller
public class Student_en {

	@Autowired
	private re_student service;

	
	
	@GetMapping("/")
	public String Student() {
		return"Student";
	}
	
	@PostMapping("/studser")

	public String stu(@ModelAttribute student_data data ,Model model) {
		
		System.out.println(data.toString());
		
	//	student_data 	data_save =	sturepo.save(data);
		service.save(data);
		return "Student";
	}
	
//	@GetMapping("/Retriving")
//	public String retri() {
//		
//		return"retrive";
//	}

	@GetMapping("/Retriving")
	public ModelAndView getAlldetails() {
		List<student_data>list=  service.getAllstudent();
		
	
	return new ModelAndView("student_details","student_data",list) ;
	
	}
	
	
}
