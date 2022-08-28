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
	 */
	@Autowired
	private DbSettings dbSettings;
	
	
	@GetMapping("/dbsettings")
	public String getDbSettings() {
		return dbSettings.toString();
	}

}
