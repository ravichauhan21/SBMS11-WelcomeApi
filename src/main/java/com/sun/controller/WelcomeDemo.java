package com.sun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeDemo {
	
	@GetMapping("/welcome")
	public String welcomeMMsg() {
		
		String str = "Ram Lord always loves Sita";
		
		return str;
		
	}

}
