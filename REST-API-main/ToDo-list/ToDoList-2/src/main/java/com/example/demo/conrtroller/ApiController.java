package com.example.demo.conrtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TodoList;
import com.example.demo.service.ApiService;

@RestController
@CrossOrigin
public class ApiController {
	
		@Autowired
		ApiService service;
		
		@PostMapping("/list")
		public String postList(@RequestBody TodoList event) {
			return service.addList(event);
		}
		
		@GetMapping("/list")
		public List<TodoList> getOrder(){
			return service.getLists();
		}
		
		@GetMapping("/list/{field}")
		public List<TodoList> getSorted(@PathVariable String field){
			return service.getListSorted(field);
		}
		
		@GetMapping("/list/{offset}/{size}")
		public List<TodoList> getPaginated(@PathVariable int offset , @PathVariable int size){
			return service.getListPaginated(offset, size);
		}
		
		@PutMapping("/list")
		public String putOrder(@RequestBody TodoList list) {
			return service.updateList(list);
		}
		
		@DeleteMapping("/list/{id}")
		public String deleteOrder(@PathVariable int id) {
			return service.deleteList(id);
		}
		

}
