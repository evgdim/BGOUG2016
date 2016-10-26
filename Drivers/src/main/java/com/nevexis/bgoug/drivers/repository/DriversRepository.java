package com.nevexis.bgoug.drivers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nevexis.bgoug.drivers.model.Driver;

public interface DriversRepository extends JpaRepository<Driver, Long> {

}
