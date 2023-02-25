package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	public boolean addStudent(Student student) {
		repository.save(student);
		return true;
	}

	public List<Student> getStudent() {
		return repository.findAll();
	}

	public Optional<Student> getStudentById(int id) {
		return repository.findById(id);
	}

	public String updateStudent(Student student) {
		repository.save(student);
		return "updated";
	}

	public String deleteStudentById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}

}
