package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TodoList;

public interface ApiRepo extends JpaRepository<TodoList,Integer> {

}
