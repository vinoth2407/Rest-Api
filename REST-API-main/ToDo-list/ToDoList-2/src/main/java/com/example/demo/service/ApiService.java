package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.TodoList;
import com.example.demo.repository.ApiRepo;

@Service
public class ApiService {
	
	@Autowired
	ApiRepo repository;
	
	
	public String addList(TodoList list) {
		System.out.print(list);
		repository.save(list);
		return "Event added";
	}
	
	public List<TodoList> getLists(){
		return repository.findAll();
	}
	
	public String updateList(TodoList list) {
		repository.save(list);
		return "Event updated";
	}
	public String  deleteList(int id) {
		repository.deleteById(id);
		return "Event Deleted";
	}
	public List<TodoList> getListSorted(String field){
		return repository.findAll(Sort.by(field));
	}
	public List<TodoList> getListPaginated(int offset,int size){
		return repository.findAll(PageRequest.of(offset, size)).getContent();
	}
}
