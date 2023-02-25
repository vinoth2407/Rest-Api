package com.main.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.page.model.Baby;

public interface BabyRepo extends JpaRepository<Baby,Integer>{

}
