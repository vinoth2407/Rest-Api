package com.main.page.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.page.model.Baby;
import com.main.page.service.BabyService;

@RestController
public class BabyController {
	@Autowired
	BabyService service;
	
	@PostMapping("/Baby")
	public boolean post(@RequestBody Baby baby) {
		return service.addBaby(baby);
	}
	
	@GetMapping("/Baby")
	public List<Baby> get(){
		return service.getAllBaby();
	}
	
	@GetMapping("/Baby/{id}")
	public Optional<Baby> getById(@PathVariable int id){
		return service.getByBabyId(id);
	}
	
	@GetMapping("/Baby/{offset}/{size}")
	public List<Baby> getByPage(@PathVariable int offset ,@PathVariable int size){
		return (service.getBabyByPagination(offset, size));
	}
	
	@GetMapping("/Baby/{offset}/{size}/{field}")
	public List<Baby> getByPage(@PathVariable int offset ,@PathVariable int size,@PathVariable String field){
		return (service.getBabyByPagination(offset, size,field));
	}
	
}
