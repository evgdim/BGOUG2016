package com.nevexis.bgoug.drivers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery")
public class DiscoveryController {
	private DiscoveryClient discoveryClient;
	@Autowired
	public DiscoveryController(DiscoveryClient discoveryClient) {
		this.discoveryClient = discoveryClient;
	}
	@GetMapping("/{serviceName}")
	public List<?> getImportantConfiguration(@PathVariable String serviceName){
		return this.discoveryClient.getInstances(serviceName);
	}
}
