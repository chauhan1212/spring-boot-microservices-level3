 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
	 * 06 Configuration Properties
	 * http://localhost:8080/actuator/configprops
	 * http://localhost:8080/dbsettings
	 * 
	 * 07 is about yml file structure
	 */
	@Autowired
	private DbSettings dbSettings;
	

	/*
	 * This we will use in 11, 12 Video for spring cloud config
	 */
	@GetMapping("/dbsettings")
	public String getDbSettings() {
		return dbSettings.toString();
	}

}
