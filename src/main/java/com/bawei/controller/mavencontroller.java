package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mavencontroller {

	
	
	@GetMapping("hello")
	public String aaa(){
		
		return "list";
	}
	
	
}
