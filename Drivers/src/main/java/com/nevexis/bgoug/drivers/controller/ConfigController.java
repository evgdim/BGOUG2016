package com.nevexis.bgoug.drivers.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
	private String importantConfig;
	
	public ConfigController(@Value("${drivers.important.config}")String importantConfig) {
		this.importantConfig = importantConfig;
	}
	@GetMapping("")
	public String getImportantConfiguration(){
		return importantConfig;
	}
}
