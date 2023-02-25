package com.main.page.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.main.page.model.Baby;
import com.main.page.repository.BabyRepo;

@Service
public class BabyService {
	@Autowired
	BabyRepo repository;
	
	public boolean addBaby(Baby baby) {
		repository.save(baby);
		return true;
	}
	
	public List<Baby> getAllBaby(){
		return repository.findAll();
	}
	
	public Optional<Baby> getByBabyId(int id){
		return repository.findById(id);
	}
	
	public List<Baby> getBabyByPagination(int offset,int size){
		return repository.findAll(PageRequest.of(offset, size)).getContent();
	}
	
	public List<Baby> getBabyByPagination(int offset,int size,String field){
		return repository.findAll(PageRequest.of(offset, size,Sort.by(field))).getContent();
	}
	
	
}
