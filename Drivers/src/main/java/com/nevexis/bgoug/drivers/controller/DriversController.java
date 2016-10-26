package com.nevexis.bgoug.drivers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nevexis.bgoug.drivers.model.Driver;
import com.nevexis.bgoug.drivers.repository.DriversRepository;

@RestController
@RequestMapping("/drivers")
public class DriversController {
	private DriversRepository driversRepository;
	
	@Autowired
	public DriversController(DriversRepository driversRepository) {
		this.driversRepository = driversRepository;
	}
	@GetMapping("")
	public List<Driver> getAll(){
		return this.driversRepository.findAll();
	}
	@PostMapping("")
	public Driver add(@RequestBody Driver driver){
		return this.driversRepository.save(driver);
	}
}
