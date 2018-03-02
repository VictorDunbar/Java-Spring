package com.codingdojo.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.driverslicense.models.License;

public interface LicenseRepository extends CrudRepository <License, Long> {
	
		License getLicenseByPersonId(Long id);

}
