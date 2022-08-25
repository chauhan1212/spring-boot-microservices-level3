 package com.vijay.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
	 * 03 Using property file config with Spring Boot
	 * 04 Using external property sources with Spring Boot
	 * 
	 * Method1:
	 * create application.properties in same dir where jar exist. ( it will override properties insider properties)
	 * java -jar .\spring-boot-config-0.0.1-SNAPSHOT.jar
	 * 
	 * Method2:
	 * java -jar .\spring-boot-config-0.0.1-SNAPSHOT.jar --server.port=8081 --my.greeting="Hello from command line args"
	 * 
	 * 
	 * http://localhost:8080/greeting
	 * http://localhost:8080/desc
	 */
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage;
	}

	@Value("${app.description}")
	private String description;
	
	@GetMapping("/desc")
	public String desc() {
		return description;
	}

}
