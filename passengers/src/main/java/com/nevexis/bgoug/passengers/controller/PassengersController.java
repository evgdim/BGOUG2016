package com.nevexis.bgoug.passengers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nevexis.bgoug.passengers.client.DriversClient;

@RestController
@RequestMapping("/passengers")
public class PassengersController {
	private DriversClient driversClient;
	@Autowired
	public PassengersController(DriversClient driversClient) {
		this.driversClient = driversClient;
	}
	@GetMapping("/drivers")
	public List<?> getDrivers(){
		return this.driversClient.getDrivers();
	}
}
