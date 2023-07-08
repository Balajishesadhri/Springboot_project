package com.example.demo.servise;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student_data;
import com.example.demo.repo.student_repo;

@Service
public class re_student {

	@Autowired
	private student_repo sturepo;
	
	public void save(student_data d) {
		
		sturepo.save(d);
	}
	
	public List<student_data> getAllstudent(){
		
		
		return sturepo.findAll();
		
	}
	
	


	}
	
	
	
	
	
	
	

