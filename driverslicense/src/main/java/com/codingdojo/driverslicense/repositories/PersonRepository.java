package com.codingdojo.driverslicense.repositories;


import org.springframework.data.repository.CrudRepository;

import com.codingdojo.driverslicense.models.Person;


public interface PersonRepository extends CrudRepository <Person, Long> {

}
