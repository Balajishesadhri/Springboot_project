package com.example.demo.controler1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



 import com.example.demo.repostrie.movie;

@RestController
public class restcontroler {
     @Autowired
	@GetMapping("/getallmovies")
     public List<movie> getAllmovie(){
		return null;
	}
}
