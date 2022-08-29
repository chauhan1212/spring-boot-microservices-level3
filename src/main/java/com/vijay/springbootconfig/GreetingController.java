 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springbootconfig.profiles.SomeService;

@RestController
public class GreetingController {

	/*
	 * 08 Spring profiles explained
	 * 
	 * http://localhost:8080/actuator/configprops
	 * http://localhost:8080/dbsettings
	 */
	@Autowired
	private DbSettings dbSettings;
	

	@GetMapping("/dbsettings")
	public String getDbSettings() {
		return dbSettings.toString();
	}	 
	
	/*
	 * 08 Spring profiles explained
	 * Using @Profile which is used in LocalSourceBean.java and ProdSourceBean.java
	 * 
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
