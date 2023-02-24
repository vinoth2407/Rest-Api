package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;

@RestController
public class ApiController 
{
	@Autowired
	ApiService service;
	
	@PostMapping("/Student")
	public String add(@RequestBody Student student)
	{
		return service.addStudent(student);
	}
	
	@GetMapping("/Student")
	public List<Student> grt()
	{
		return service.getStudent();
	}
	
	@GetMapping("/Student/{id}")
	public Optional<Student> readyById(@PathVariable int id)
	{
		return service.getStudentById(id);
	}
	
	@PutMapping("/Student")
	public String update(@RequestBody Student student)
	{
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/Student")
	public String delete(@RequestParam int id)
	{
		return service.deleteStudentById(id);
	}

}
