package com.nevexis.bgoug.drivers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Driver {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String drivingLicence;
}
