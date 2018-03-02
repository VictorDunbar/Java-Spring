package com.codingdojo.subs.repo;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.subs.models.Sub;

public interface SubRepo extends CrudRepository<Sub, Long> {

}
