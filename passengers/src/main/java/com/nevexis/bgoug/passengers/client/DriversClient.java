package com.nevexis.bgoug.passengers.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nevexis.bgoug.passengers.model.Driver;

@FeignClient("drivers")
@Component
public interface DriversClient {
	@RequestMapping(value="/drivers", method=RequestMethod.GET)
	public List<Driver> getDrivers();
}
