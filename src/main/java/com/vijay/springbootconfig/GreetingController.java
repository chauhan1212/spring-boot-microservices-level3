 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//13 Dynamic config with spring Boot
//To change dynamic properties from git  
@RefreshScope
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
	 * 13 Dynamic config with spring Boot
	 * http://localhost:8888/spring-boot-config/default
	 * http://localhost:8080/dbsettings
	 * 
	 * POSTMAN:
	 * POST call:
	 * localhost:8080/actuator/refresh
	 * 
	 * GET:
	 * localhost:8080/actuator/health
	 * 
	 */
	@GetMapping("/dbsettings")
	public String getDbSettings() {
		return dbSettings.toString();
	}
}
