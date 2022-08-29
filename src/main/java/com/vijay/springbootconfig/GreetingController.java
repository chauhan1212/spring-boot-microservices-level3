 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
	 * 12 Setting up spring cloud config client
	 * 
	 * To Start This We should have below things ready:
	 * 	1. Cloud Config Server up in port 8888
	 *  2. Git Repo which connects to Cloud Config Server
	 *  
	 * http://localhost:8080/actuator/configprops
	 * http://localhost:8080/dbsettings
	 */
	@Autowired
	private DbSettings dbSettings;
	
	/*
	 * 12 Setting up spring cloud config client
	 */
	@GetMapping("/dbsettings")
	public String getDbSettings() {
		return dbSettings.toString();
	}
}
 