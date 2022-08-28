 package com.vijay.springbootconfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
	 * 05 Three Value annotation tricks you should know
	 *  http://localhost:8080/staticmessage
	 *  http://localhost:8080/defaultvalue
	 *  
	 */
	@Value("some static message")
	private String staticMessage;

	@GetMapping("/staticmessage")
	public String staticMessage() {
		return staticMessage;
	}	 
	
	/**
	 * if my.defaultvalue not available in application.properties then it will take "default value"
	 */
	@Value("${my.defaultvalue: default value}")
	private String defaultValue;

	@GetMapping("/defaultvalue")
	public String defaultValue() {
		return defaultValue;
	}
	
	
	/*
	 * Fetching List, Set and Map using @Value annotation
	 * http://localhost:8080/listvalues
	 * http://localhost:8080/setvalues
	 * http://localhost:8080/mapvalues
	 */
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@GetMapping("/listvalues")
	public List<String> listvalue() {
		return listValues;
	}
	
	@Value("${my.set.values}")
	private Set<String> setValues;
	
	@GetMapping("/setvalues")
	public Set<String> setvalue() {
		return setValues;
	}
	
	@Value("#{${dbvalues}}")
	private Map<String,String> mapValues;
	
	@GetMapping("mapvalues")
	public Map<String,String> mapValues() {
		return mapValues;
	}

}
