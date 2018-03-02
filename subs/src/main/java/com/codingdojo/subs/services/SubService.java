package com.codingdojo.subs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.subs.models.Sub;
import com.codingdojo.subs.repo.SubRepo;

@Service
public class SubService {
	
	private SubRepo subRepo;
	
	public SubService(SubRepo subRepo) {
		this.subRepo = subRepo;
	}

	public List<Sub> getAll(){
		return (List<Sub>) subRepo.findAll();
	}
	public Sub getOneById(Long id) {
		return subRepo.findOne(id);
	}
	public void createSub(Sub sub) {
		subRepo.save(sub);
	}
	public void updateSub(Sub sub) {
		subRepo.save(sub);
	}
	public void deleteSub(Long id) {
		subRepo.delete(id);
	}
}
