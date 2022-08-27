 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springbootconfig.profiles.SomeService;

@RestController
public class GreetingController {

	/*
	 * 08 Spring profiles explained
	 * http://localhost:8080/profileinfo
	 * 
	 */
	@Autowired
	SomeService ss;
	
	@GetMapping("/profileinfo")
	public String getProfileInfo() {
		return ss.toString();
	}

}
