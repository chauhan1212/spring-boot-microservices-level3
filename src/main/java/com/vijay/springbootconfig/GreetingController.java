 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
	 * 09 Using Environment object
	 * http://localhost:8080/envdetails
	 * 
	 * From Video 10 we are using different project called spring-cloud-config-server
	 */
	@Autowired
	Environment env;
	
	@GetMapping("/envdetails")
	public String getEnvDetails() {
		System.out.println("Active Profiles: "+env.getActiveProfiles());
		return env.toString();
	}
}
