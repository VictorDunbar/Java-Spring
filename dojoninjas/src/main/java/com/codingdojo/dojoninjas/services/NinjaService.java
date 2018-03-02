package com.codingdojo.dojoninjas.services;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	public NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Long addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
		return ninja.getId();
	}
	
	public Ninja getNinja(Long id) {
		return ninjaRepo.findOne(id);
	}
	
	public void updateNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		ninjaRepo.delete(id);
	}
}

