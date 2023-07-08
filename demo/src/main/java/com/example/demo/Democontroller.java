package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroller {
    
	//http://localhost:8080/hello
	@GetMapping("/hello")
	@ResponseBody // without html page
	public String hello() {
		
	 return"hello welecome to Spring boot";
	}
//	http://localhost:8080/Welcome
	@GetMapping("/Welcome")
	//Welcome.HTML page will call
	public String Welcome() {
		
		return "Welcome";
	}
	// add to variable in html page
	//http://localhost:8080/add/a/b   ---> this is pathVariale
	@GetMapping("/add/{a}/{b}")
	@ResponseBody
	public int add(@PathVariable("a")int a, @PathVariable("b")int b) {
		return (a+b);
		
		
	}//http:localhost:8080/addiction?a=10&b=20
	
	@GetMapping("/addiction")
	@ResponseBody  //paramater url
	public int addiction(@RequestParam("a")int a,@RequestParam(value ="b",defaultValue="0") int b) {
		return(a+b);
		//default is automatic value if we not given in url
	}
	
	}


